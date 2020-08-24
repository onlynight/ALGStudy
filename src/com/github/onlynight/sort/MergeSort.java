package com.github.onlynight.sort;

import java.util.List;

/**
 * <b>归并排序</b>
 *
 * https://blog.csdn.net/qq_36442947/article/details/81612870
 */
public class MergeSort implements Sort {

    @Override
    public void sort(List<Integer> array) {
        sort(array, null);
    }

    @Override
    public void sort(List<Integer> array, StepCallback callback) {
    }

}
