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

        boolean matched = false;
        for (int i = 0; i < targetLen; i++) {
            for (int j = 0; j < patternLen; j++) {
                if (targetChar[i + j] == patternChar[j]) {
                    matched = true;
                } else {
                    matched = false;
                    break;
                }
            }
            if (matched) {
                int index = find(patternChar, patternLen, targetChar[i]);
                if (index == -1) {
                    i += patternLen;
                } else {
                    i += index;
                }
            }
        }

        return -1;
    }

    private int find(char[] patternChar, int patternLen, char target) {
        if (patternChar == null) {
            return -1;
        }

        int index = -1;
        for (int i = 0; i < patternLen; i++) {
            if (patternChar[i] == target) {
                index = i;
                break;
            }
        }

        return index;
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
