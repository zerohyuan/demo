package cn.zerohy.bug.immutable;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author hyuan
 * @Date 2019-07-22 20:59
 * @Description 不可变对象
 */
public class ImmutableObjectTest {

    /**
     * 金额的累加
     */
    @Test
    public void test() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        for (int i = 0; i < 10; i++) {
            bigDecimal.add(BigDecimal.ONE);
        }
        System.out.println(bigDecimal);
    }
}
