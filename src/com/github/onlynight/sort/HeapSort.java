package com.github.onlynight.sort;

import java.util.List;

/**
 * <b>堆排序</b>
 * https://blog.csdn.net/qq_36186690/article/details/82505569
 *
 * <b>堆是具有以下性质的完全二叉树：每个结点的值都大于或等于其左右孩子结点的值，称为大顶堆；或者每个结点的值都小于或等于其左右孩子结点的值，称为小顶堆。</b>
 *
 * a.将无序序列构建成一个堆，根据升序降序需求选择大顶堆或小顶堆;
 * b.将堆顶元素与末尾元素交换，将最大元素"沉"到数组末端;
 * c.重新调整结构，使其满足堆定义，然后继续交换堆顶元素与当前末尾元素，反复执行调整+交换步骤，直到整个序
 */
public class HeapSort implements Sort {

    @Override
    public void sort(List<Integer> array) {
        sort(array, null);
    }

    @Override
    public void sort(List<Integer> array, StepCallback callback) {
        if (array == null) {
            return;
        }
    }

}
