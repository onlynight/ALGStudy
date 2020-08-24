package com.github.onlynight.utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {

    /**
     * 初始化集合-
     *
     * @return 返回乱序的集合列表
     */
    public static List<Integer> initList() {
        List<Integer> array = new ArrayList<>();
        array.add(123);
        array.add(312);
        array.add(321);
        array.add(1);
        array.add(8);
        array.add(4);
        array.add(6);
        array.add(9);
        array.add(890);
        array.add(1234);
        return array;
    }

    /**
     * 打印列表集合
     *
     * @param array 指定要打印的列表集合
     */
    public static void printArray(List<Integer> array) {
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

}
