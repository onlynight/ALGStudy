package com.github.onlynight.sort;

import java.util.List;

/**
 * 从第一个值开始，依次和后面的值比较，若比后面的数字大则交换位置；
 * 遍历完成依次下标往后移一位，直至最后一个值。
 */
public class BubbleSort implements Sort {

    @Override
    public void sort(List<Integer> array) {
        sort(array, null);
    }

    @Override
    public void sort(List<Integer> array, StepCallback callback) {
        if (array == null) {
            return;
        }

        int temp;
        for (int i = 0; i < array.size(); i++) {
            for (int j = i; j < array.size(); j++) {
                if (array.get(i) > array.get(j)) {
                    temp = array.get(j);
                    array.set(j, array.get(i));
                    array.set(i, temp);
                    if (callback != null) {
                        boolean showStep = callback.onChanged(array);
                        if (showStep) {
                            System.out.println("i = " + i + " j = " + j + " swap value = " + array.get(i) + " " + array.get(j));
                        }
                    }
                }
            }
        }
    }

}
