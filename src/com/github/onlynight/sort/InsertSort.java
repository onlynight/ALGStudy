package com.github.onlynight.sort;

import java.util.List;

import static com.github.onlynight.utils.ArrayUtils.initList;
import static com.github.onlynight.utils.ArrayUtils.printArray;

/**
 * <br>插入排序</br>
 * 从待排序的数组中选择一个值插入到已经有序的列表中，重复上述操作直至遍历完列表。
 */
public class InsertSort implements Sort {

    @Override
    public void sort(List<Integer> array) {
        sort(array, null);
    }

    @Override
    public void sort(List<Integer> array, StepCallback callback) {
        if (array == null) {
            return;
        }

        int temp, j;
        boolean isPrintStep = false;
        if (callback != null) {
            isPrintStep = callback.showSteps();
        }
        for (int i = 0; i < array.size(); i++) {
            temp = array.get(i);
            j = i - 1;
            while (j >= 0 && array.get(j) > temp) {
                if (isPrintStep) {
                    System.out.println("i = " + i + " value = " + temp + " j = " + j + " value = " + array.get(j));
                }
                array.set(j + 1, array.get(j));
                j -= 1;
                if (callback != null && isPrintStep) {
                    callback.onChanged(array);
                }
            }
            array.set(j + 1, temp);
            if (callback != null) {
                callback.onChanged(array);
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> array = initList();
        System.out.println("原始列表：插入排序");
        printArray(array);
        new InsertSort().sort(array, new StepCallback() {
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
