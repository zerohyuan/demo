package cn.zerohy.easy.excel.service.parser;

import cn.zerohy.easy.excel.model.AbcRecord;
import cn.zerohy.easy.excel.service.Parser;
import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.*;

public class AbcParserTest {

    @Test
    public void parse() {
        Parser parser = new AbcParser();
        List<AbcRecord> recordList = parser.parse(Paths.get("raw", "20120101-20130101-detail20180925.xls"));
        recordList.forEach(System.out::println);
    }
}