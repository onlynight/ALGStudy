package com.github.onlynight.sort;

import java.util.ArrayList;
import java.util.List;

public class SortUtils {

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

    public static void printArray(List<Integer> array) {
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

}
