package com.github.onlynight.pattern;

public class SundayPattern implements Pattern {

    @Override
    public int match(String targetStr, String patternStr) {
        if (StringUtils.isEmpty(targetStr) || StringUtils.isEmpty(patternStr)) {
            return -1;
        }

        char[] targetChar = targetStr.toCharArray();
        char[] patternChar = patternStr.toCharArray();
        int targetLen = targetChar.length;
        int patternLen = patternChar.length;

        for (int i = 0; i < targetLen; i++) {

        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Sunday Pattern:");
        String target = "qwerrtyuyuiopqwerqwer";
        String pattern = "i";
        int result = new SundayPattern().match(target, pattern);
        System.out.println(result);
        pattern = "er";
        result = new SundayPattern().match(target, pattern);
        System.out.println(result);
    }

}
