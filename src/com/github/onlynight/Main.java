package com.github.onlynight;

import com.github.onlynight.sort.BubbleSort;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = initList();
        System.out.println("原始列表");
        printArray(array);

        System.out.println("steps:");
        new BubbleSort().sort(array, step -> {
//            printArray(step);
            return false;
        });

        System.out.println("排序后");
        printArray(array);
    }

    private static List<Integer> initList() {
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

    private static void printArray(List<Integer> array) {
        for (Integer integer : array) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

}
