package com.github.onlynight.sort;

import java.util.List;

import static com.github.onlynight.utils.ArrayUtils.initList;
import static com.github.onlynight.utils.ArrayUtils.printArray;

/**
 * <b>快速排序</b>
 * 取一个元素，将比它大的元素放在右边，将比它小的元素放在左边；
 * 将上述集合分为左右两半，递归执行上述操作。
 */
public class QuickSort implements Sort {

    @Override
    public void sort(List<Integer> array) {
        sort(array, null);
    }

    @Override
    public void sort(List<Integer> array, StepCallback callback) {
        if (array == null) {
            return;
        }

        quickSort(array, 0, array.size() - 1, callback);
    }

    private void quickSort(List<Integer> array, int left, int right, StepCallback callback) {
        System.out.println("quickSort(" + left + "," + right + ")");
        if (left < right) {
            int mid = partition(array, left, right, callback);
            quickSort(array, left, mid - 1, callback);
            quickSort(array, mid + 1, right, callback);
        }
    }

    private int partition(List<Integer> array, int left, int right, StepCallback callback) {
        Integer temp = array.get(left);

        if (callback != null && callback.showSteps()) {
            System.out.println("CENTER(" + temp + ")");
        }

        while (left < right) {
            while (left < right && array.get(right) >= temp) {
                right--;
            }
            array.set(left, array.get(right));
            if (callback != null && callback.showSteps()) {
                System.out.println("SORT right(" + right + ") = " + array.get(right) + " swap (left(" + left + ") = " + array.get(left) + " , right(" + right + ") = " + array.get(right) + ")");
            }
            while (left < right && array.get(left) <= temp) {
                left++;
            }
            array.set(right, array.get(left));
            if (callback != null && callback.showSteps()) {
                System.out.println("SORT left(" + left + ") = " + array.get(left) + " swap (right(" + right + ") = " + array.get(right) + " , left(" + left + ") = " + array.get(left) + ")");
            }
        }
        array.set(left, temp);
        if (callback != null) {
            callback.onChanged(array);
        }
        return left;
    }

    public static void main(String[] args) {
        List<Integer> array = initList();
        System.out.println("原始列表：快速排序");
        printArray(array);
        new QuickSort().sort(array, new StepCallback() {
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
