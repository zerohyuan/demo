package cn.zerohy.univocity.parsers.service.univocity.parser;


import cn.zerohy.univocity.parsers.service.Parser;
import com.univocity.parsers.common.processor.BeanListProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

import java.lang.reflect.ParameterizedType;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.List;

/**
 * @Author hyuan
 * @Date 2019-05-02 14:44
 * @Description TODO
 */
public abstract class AbstractCsvParser<T> implements Parser<T> {

    protected abstract Integer getNumOfRowsToSkip();

    protected abstract Charset getCharset();

    @Override
    public List<T> parse(Path path) {
        CsvParserSettings csvParserSettings = new CsvParserSettings();
        Integer numOfRowsToSkip = getNumOfRowsToSkip();
        //设置跳过注释行
        csvParserSettings.setNumberOfRowsToSkip(numOfRowsToSkip == null ? 0 : numOfRowsToSkip);
        csvParserSettings.setLineSeparatorDetectionEnabled(true);
        csvParserSettings.setHeaderExtractionEnabled(true);
        Class<T> aClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        BeanListProcessor<T> beanListProcessor = new BeanListProcessor<>(aClass);
        csvParserSettings.setProcessor(beanListProcessor);
        CsvParser csvParser = new CsvParser(csvParserSettings);
        Charset charset = getCharset();
        //指定编码
        csvParser.parse(path.toFile(), charset == null ? Charset.forName("UTF-8") : charset);
        List<T> list = beanListProcessor.getBeans();
        parseAfter(list);
        return list;
    }

    protected abstract void parseAfter(List<T> list);
}
