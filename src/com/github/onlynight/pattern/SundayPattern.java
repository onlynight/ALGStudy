package com.github.onlynight.pattern;

public class SundayPattern implements Pattern {

    @Override
    public int match(String targetStr, String patternStr) {
        return -1;
    }

    public static void main(String[] args) {
        String target = "qwerrtyuyuiopqwerqwer";
        String pattern = "i";
        int result = new SundayPattern().match(target, pattern);
        System.out.println(result);
        pattern = "er";
        result = new SundayPattern().match(target, pattern);
        System.out.println(result);
    }
    
}
