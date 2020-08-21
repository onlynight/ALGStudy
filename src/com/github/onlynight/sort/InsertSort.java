package com.github.onlynight.sort;

import java.util.ArrayList;
import java.util.List;

public class InsertSort implements Sort {
    @Override
    public void sort(List<Integer> array) {
    }

    @Override
    public void sort(List<Integer> array, StepCallback callback) {
        if (array == null) {
            return;
        }
        List<Integer> result = new ArrayList<>(array.size());

        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < result.size(); j++) {
                if (array.get(i) >= result.get(j)) {
                }
            }
        }
    }
}
