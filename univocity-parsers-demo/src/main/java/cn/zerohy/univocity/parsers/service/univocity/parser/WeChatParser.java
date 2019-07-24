package cn.zerohy.univocity.parsers.service.univocity.parser;


import cn.zerohy.univocity.parsers.model.WeChatRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;
import java.util.List;

/**
 * @Author hyuan
 * @Date 2019-05-03 13:22
 * @Description TODO
 */
@Slf4j
@Service
public class WeChatParser extends AbstractCsvParser<WeChatRecord> {
    @Override
    protected Integer getNumOfRowsToSkip() {
        return 16;
    }

    @Override
    protected Charset getCharset() {
        return Charset.forName("UTF-8");
    }

    @Override
    protected void parseAfter(List<WeChatRecord> list) {

    }
}
