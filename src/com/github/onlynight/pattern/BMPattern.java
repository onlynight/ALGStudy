package com.github.onlynight.pattern;

/**
 * <b>BM模式匹配算法</b>
 * 1. 将主串和模式串的左端对齐
 * 2. 从模式串的右侧开始比较
 * 3. 若相等继续模式串从后往前依次比较，直至全部比较完成，若都相等这匹配到字符串
 * 4. 若不相等，查找主串中是否有字符能匹配到模式串，若能匹配则将字串向右移动，将相同的字符对其，再重复1-3.
 * 5. 若不能匹配到模式串中的字符，则直接将模式串向右移动模式串的长度重复1-4步骤，直至匹配到或者主串比较结束。
 */
public class BMPattern implements Pattern {

    @Override
    public int match(String targetStr, String patternStr) {
        if (StringUtils.isEmpty(targetStr) || StringUtils.isEmpty(patternStr)) {
            return -1;
        }

        char[] targetChar = targetStr.toCharArray();
        char[] patternChar = patternStr.toCharArray();
        int targetLen = targetChar.length;
        int patternLen = patternChar.length;

        int lastMatchIndex = -1;
        for (int i = 0; i < targetLen; i++) {
            if (patternChar[patternLen - 1] == targetChar[i + patternLen - 1]) {
                for (int j = patternLen - 1; j >= 0; j--) {
                    if (patternChar[j] != targetChar[i + j]) {
                        if (lastMatchIndex != -1) {
                            break;
                        }
                    } else {
                        lastMatchIndex = i + j;
                        if (j == 0) {
                            return i;
                        }
                    }
                }
            }
            if (lastMatchIndex == -1) {
                i += patternLen;
            } else {
                i += lastMatchIndex;
            }
            lastMatchIndex = -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String target = "qwerrtyuyuiopqwerqwer";
        String pattern = "i";
        int result = new BFPattern().match(target, pattern);
        System.out.println(result);
        pattern = "er";
        result = new BFPattern().match(target, pattern);
        System.out.println(result);
    }

}
