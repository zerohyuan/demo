package cn.zerohy.univocity.parsers.service.univocity.parser;


import cn.zerohy.univocity.parsers.service.Parser;
import com.univocity.parsers.common.processor.BeanListProcessor;
import com.univocity.parsers.tsv.TsvParser;
import com.univocity.parsers.tsv.TsvParserSettings;

import java.lang.reflect.ParameterizedType;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.List;

/**
 * @Author hyuan
 * @Date 2019-05-02 14:44
 * @Description TODO
 */
public abstract class AbstractTsvParser<T> implements Parser<T> {

    protected abstract Integer getNumOfRowsToSkip();

    protected abstract Charset getCharset();

    @Override
    public List<T> parse(Path path) {
        TsvParserSettings tsvParserSettings = new TsvParserSettings();
        tsvParserSettings.setLineJoiningEnabled(true);
        tsvParserSettings.setHeaderExtractionEnabled(true);
        tsvParserSettings.setLineSeparatorDetectionEnabled(true);
        Class<T> aClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        BeanListProcessor<T> beanListProcessor = new BeanListProcessor<>(aClass);
        tsvParserSettings.setProcessor(beanListProcessor);
        TsvParser tsvParser = new TsvParser(tsvParserSettings);
        Charset charset = getCharset();
        tsvParser.parse(path.toFile(), charset == null ? Charset.forName("UTF-8") : charset);
        List<T> list = beanListProcessor.getBeans();
        parseAfter(list);
        return list;
    }

    protected abstract void parseAfter(List<T> list);
}
