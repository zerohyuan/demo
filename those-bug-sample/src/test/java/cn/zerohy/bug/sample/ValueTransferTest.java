package cn.zerohy.bug.sample;

import org.junit.Test;

/**
 * @Author hyuan
 * @Date 2019-07-06 16:23
 * @Description Java中的值传递
 */
public class ValueTransferTest {

    @Test
    public void strTest() {
        String str = "ABC";
        changeStr(str);
        System.out.println(str);
    }

    private void changeStr(String str) {
        String replace = str.replace('B', 'D');
        System.out.println(replace);
    }
}
