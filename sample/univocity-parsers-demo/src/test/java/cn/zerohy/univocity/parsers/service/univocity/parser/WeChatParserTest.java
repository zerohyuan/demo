package cn.zerohy.univocity.parsers.service.univocity.parser;

import cn.zerohy.univocity.parsers.model.WeChatRecord;
import org.junit.Test;

import java.nio.file.Paths;
import java.util.List;

public class WeChatParserTest {

    @Test
    public void parser() {
        WeChatParser weChatParser = new WeChatParser();
        List<WeChatRecord> recordList = weChatParser.parse(Paths.get("raw", "20160101-20160401.csv"));
        recordList.forEach(System.out::println);
    }

}