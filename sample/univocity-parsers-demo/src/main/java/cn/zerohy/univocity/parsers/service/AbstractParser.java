package cn.zerohy.univocity.parsers.service;

import java.nio.file.Path;
import java.util.List;

/**
 * @Author hyuan
 * @Date 2019-05-02 14:07
 * @Description TODO
 */
public abstract class AbstractParser<T> implements Parser<T> {
    @Override
    public abstract List<T> parse(Path path);

}
