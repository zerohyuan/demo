package cn.zerohy.bug.sample;

import lombok.Getter;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author hyuan
 * @Date 2019-07-06 14:09
 * @Description 常见易引发NPE的代码
 */
public class NullPointerExceptionTest {

    /**
     * 自动拆箱引发的空指针，常见于状态比较
     */
    @Test
    public void unBoxing() {

        Integer a = 99;//自动装箱 等价于 Integer.valueOf(99)
        int b = a;//自动拆箱 等价于 a.intValue()

        Integer c = null;
        int d = c;//NPE

        if (c == d) {
            //do something
        }
    }

    /**
     * 级联调用
     */
    @Test
    public void cascade() {
        @Getter
        class User {
            private String name;
        }

        List<User> userList = Arrays.asList(new User(), new User());
        if (!CollectionUtils.isEmpty(userList)) {
            for (User user : userList) {
                if (user.getName().contains("tom")) {
                    //do something
                }
            }
        }
    }

    /**
     * 字符串判等
     */
    @Test
    public void equals() {
        String str = null;

        if ("abc".equals(str)) {
            //do something
        }

        if (str.equals("abc")) {
            //do something
        }

    }

    /**
     * map添加元素时的空指针异常
     */
    @Test
    public void map() {

        Map hashMap = new HashMap();
        hashMap.put(null, "a");
        hashMap.put("a", null);

        System.out.println(hashMap);
        hashMap.put(null, "aa");
        System.out.println(hashMap);

        Map treeMap = new TreeMap();
//        treeMap.put(null, "b");//NPE
        treeMap.put("b", null);

        Map concurrentMap = new ConcurrentHashMap();
//        concurrentMap.put(null, "c");//NPE
//        concurrentMap.put("c", null);//NPE
    }

}
