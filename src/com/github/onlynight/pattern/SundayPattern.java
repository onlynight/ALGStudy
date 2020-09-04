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
        int matchedIndex = -1;
        for (int i = 0; i < targetLen; i++) {
            for (int j = 0; j < patternLen; j++) {
                System.out.println("i = " + i + ",j = " + j + "; targetChar[i + j] = " + targetChar[i + j] + " patternChar[j] = " + patternChar[j]);
                if (targetChar[i + j] == patternChar[j]) {
                    matched = true;
                } else {
                    matched = false;
                    break;
                }
            }
            if (matched) {
                matchedIndex = i;
                break;
            }
            if (i < targetLen - 1) {
                int index = find(patternChar, patternLen, targetChar[i + patternLen]);
                System.out.println("next matched index = " + index);
                if (index == -1) {
                    i += (patternLen - 1);
                } else {
                    i += (patternLen - 1 - index);
                }
            }
        }

        return matchedIndex;
    }

    private int find(char[] patternChar, int patternLen, char target) {
        if (patternChar == null) {
            return -1;
        }

        int index = -1;
        for (int i = 0; i < patternLen; i++) {
            if (patternChar[i] == target) {
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println("Sunday Pattern:");
        String target = "qwerrtyuyuiopqwerqwer";
        String pattern = "yu";
        int result = new SundayPattern().match(target, pattern);
        System.out.println(result);
        pattern = "erqwe";
        result = new SundayPattern().match(target, pattern);
        System.out.println(result);
        pattern = "uyuiopqw";
        result = new SundayPattern().match(target, pattern);
        System.out.println(result);
    }

}
