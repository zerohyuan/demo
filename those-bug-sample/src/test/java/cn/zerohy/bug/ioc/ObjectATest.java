package cn.zerohy.bug.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ObjectATest {

    @Autowired
    ObjectB objectB;

    @Test
    public void object() {
        System.out.println(objectB);
    }

}