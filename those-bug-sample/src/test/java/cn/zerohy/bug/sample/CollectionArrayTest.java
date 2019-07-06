package cn.zerohy.bug.sample;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author hyuan
 * @Date 2019-07-06 15:04
 * @Description 集合和数组中常见的异常
 */
public class CollectionArrayTest {

    /**
     * 数组转List
     */
    @Test
    public void asList() {
        String[] strArr = {"a", "b", "c"};
        List<String> strList = Arrays.asList(strArr);
//        strList.add("d");//java.lang.UnsupportedOperationException
        strList.set(2, "d");
//        strList.set(3, "c");//java.lang.ArrayIndexOutOfBoundsException: 3

        System.out.println(strList);

        System.out.println(strList.getClass().getName());//java.util.Arrays$ArrayList
        System.out.println(strList instanceof java.util.ArrayList);//false

    }

    /**
     * List转数组
     */
    @Test
    public void toArray() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        Object[] objects = list.toArray();
//        String[] strArr = (String[]) list.toArray();//java.lang.ClassCastException

        String[] strArr1 = new String[list.size()];
        list.toArray(strArr1);
        System.out.println(String.join( ",", strArr1));
    }

    /**
     * List分割
     */
    @Test
    public void subList() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d");
        System.out.println("原List: \t" + list);

        List<String> subList = list.subList(0, 1);
        System.out.println(subList.getClass().getName());//java.util.ArrayList$SubList
        System.out.println("第一次分割：\t" + subList);//[a]

        subList.add("e");
        System.out.println("添加元素：\t" + subList);//[a, e]
        //分割后的sublist是list的视图 对子集合修改会影响原集合
        System.out.println("1--原List: \t" + list);//[a, e, b, c, d]
        subList.remove("a");
        System.out.println("2--原List: \t" + list);//[e, b, c, d]

        //对原集合的修改会导致子集合的遍历、增加、删除产生异常
        list.add("f");
//        System.out.println("原List添加元素:\t" + subList);//java.util.ConcurrentModificationException
//        subList.add("g");//java.util.ConcurrentModificationException
//        subList.remove("a");//java.util.ConcurrentModificationException



    }
}
