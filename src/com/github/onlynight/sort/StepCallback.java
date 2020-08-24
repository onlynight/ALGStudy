package com.github.onlynight.sort;

import java.util.List;

public interface StepCallback {
    void onChanged(List<Integer> step);

    boolean showSteps();
}
