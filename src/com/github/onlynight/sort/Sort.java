package com.github.onlynight.sort;

import java.util.List;

public interface Sort {

    void sort(List<Integer> array);

    void sort(List<Integer> array, StepCallback callback);

}
