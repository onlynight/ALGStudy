package com.github.onlynight.sort;

import java.util.List;

/**
 * alg step callback interface
 */
public interface StepCallback {

    /**
     * 每一步循环执行后集合的状态
     * @param step 这一步操作后的集合
     */
    void onChanged(List<Integer> step);

    /**
     * 是否显示操作过程中的交换位置等步骤
     * @return true 显示， false 不显示
     */
    boolean showSteps();

}
