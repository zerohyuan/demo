package cn.zerohy.bug.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author hyuan
 * @Date 2019-07-21 16:29
 * @Description TODO
 */
@Component
public class ObjectA {

    @Autowired
    private ObjectB objectB;

    public ObjectA(ObjectB objectB) {
        this.objectB = objectB;
    }
}
