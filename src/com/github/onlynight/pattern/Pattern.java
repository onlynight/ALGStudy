package com.github.onlynight.pattern;

/**
 * 字符串模式匹配
 * 常用模式匹配算法
 * https://www.cnblogs.com/iwangzhengchao/p/10283326.html
 * https://www.jianshu.com/p/8690bd38ea62
 */
public interface Pattern {

    int match(String targetStr, String patternStr);

}
