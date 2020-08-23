package com.github.onlynight.sort;

import java.util.List;

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
                    boolean showSteps = callback.onChanged(array);
                    if (showSteps) {
                        System.out.println("min index = " + swapIndex + " min value = " + minValue);
                    }
                }
                minValue = Integer.MAX_VALUE;
                swapIndex = -1;
            }
        }
    }
}
