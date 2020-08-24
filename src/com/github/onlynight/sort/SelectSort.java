package com.github.onlynight.sort;

import java.util.List;

import static com.github.onlynight.sort.SortUtils.initList;
import static com.github.onlynight.sort.SortUtils.printArray;

/**
 * <b>选择排序</b>
 * 从待排序的列表中找到一个最小的值和放到第一个，依次类推将找到的第二个最小值放到第二个，直至最后一个。
 */
public class SelectSort implements Sort {
    @Override
    public void sort(List<Integer> array) {
        sort(array, null);
    }

    @Override
    public void sort(List<Integer> array, StepCallback callback) {
        if (array == null) {
            return;
        }

        int minValue = Integer.MAX_VALUE;
        int temp, swapIndex = -1;
        for (int i = 0; i < array.size(); i++) {
            for (int j = i; j < array.size(); j++) {
                if (array.get(j) < minValue) {
                    minValue = array.get(j);
                    swapIndex = j;
                }
            }
            if (minValue != Integer.MAX_VALUE) {
                temp = array.get(i);
                array.set(i, array.get(swapIndex));
                array.set(swapIndex, temp);
                if (callback != null) {
                    callback.onChanged(array);
                    if (callback.showSteps()) {
                        System.out.println("min index = " + swapIndex + " min value = " + minValue);
                    }
                }
                minValue = Integer.MAX_VALUE;
                swapIndex = -1;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> array = initList();
        System.out.println("原始列表：选择排序");
        printArray(array);
        new SelectSort().sort(array, new StepCallback() {
            @Override
            public void onChanged(List<Integer> step) {
                printArray(step);
            }

            @Override
            public boolean showSteps() {
                return true;
            }
        });
        System.out.println("排序后");
        printArray(array);
    }
}
