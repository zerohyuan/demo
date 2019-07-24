package cn.zerohy.easy.excel.service.parser;

import cn.zerohy.easy.excel.model.AbcRecord;
import cn.zerohy.easy.excel.service.Parser;
import com.alibaba.excel.EasyExcelFactory;
import com.alibaba.excel.metadata.Sheet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.List;

/**
 * @Author hyuan
 * @Date 2019-05-03 14:41
 * @Description TODO
 */
@Slf4j
@Service
public class AbcParser implements Parser<AbcRecord> {
    @Override
    public List<AbcRecord> parse(Path path) {
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(path.toFile()));
            Sheet sheet = new Sheet(1, 3, AbcRecord.class);
            List list = EasyExcelFactory.read(in, sheet);
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
