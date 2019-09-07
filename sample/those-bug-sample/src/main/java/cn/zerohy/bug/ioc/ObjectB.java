package cn.zerohy.bug.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author hyuan
 * @Date 2019-07-21 16:30
 * @Description TODO
 */
@Component
public class ObjectB {

    @Autowired
    private ObjectA objectA;

    public ObjectB(ObjectA objectA) {
        this.objectA = objectA;
    }
}
