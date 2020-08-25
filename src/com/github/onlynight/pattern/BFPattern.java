package com.github.onlynight.pattern;

public class BFPattern implements Pattern {

    @Override
    public int match(String targetStr, String patternStr) {
        if (StringUtils.isEmpty(targetStr) || StringUtils.isEmpty(patternStr)) {
            return -1;
        }

        char[] targetChar = targetStr.toCharArray();
        char[] patternChar = patternStr.toCharArray();

        int targetLen = targetChar.length;
        int patternLen = patternChar.length;
        int matchStart = -1, matchEnd = -1;
        for (int i = 0; i < targetLen; i++) {
            if (patternChar[0] == targetChar[i] && targetLen - i >= patternLen) {
                matchStart = i;
                for (int j = 0; j < patternLen; j++) {
                    if (targetChar[i + j] == patternChar[j]) {
                        matchEnd = i + j;
                    } else {
                        matchStart = matchEnd = -1;
                    }
                }
                if (matchStart != -1 && matchEnd != -1) {
                    break;
                }
            }
        }

        return matchStart;
    }

    public static void main(String[] args) {
        String target = "qwerrtyuyuiopqwerqwer";
        String pattern = "i";
        int result = new BFPattern().match(target, pattern);
        System.out.println(result);
    }

}
