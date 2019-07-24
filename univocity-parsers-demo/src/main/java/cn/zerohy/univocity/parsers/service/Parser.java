package cn.zerohy.univocity.parsers.service;

import java.nio.file.Path;
import java.util.List;

/**
 * @Author hyuan
 * @Date 2019-05-02 13:25
 * @Description TODO
 */
public interface Parser<T> {

    /**
     * 解析文件，返回流水记录
     * @param path 文件的路径
     * @return
     */
    List<T> parse(Path path);

}
