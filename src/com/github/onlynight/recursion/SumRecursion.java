package com.github.onlynight.recursion;

public class SumRecursion {

    public static int sum(int[] array, int index) {
        if (index == 0) {
            return array[0];
        } else {
            return sum(array, index - 1) + array[index];
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = sum(array, array.length - 1) / array.length;
        System.out.println("result = " + result);
    }

}
