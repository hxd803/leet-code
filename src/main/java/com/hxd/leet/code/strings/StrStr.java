package com.hxd.leet.code.strings;

/**
 * 28. 实现 strStr()
 *
 * @author 黄雪冬
 * @version 0.0.1
 * @date 2019/10/31 14:03
 */
public class StrStr {

    public static void main(String[] args) {
        String haystack = "abaabaaaaab", needle = "aaa";
        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {
        int[] next = getNext(needle);

        if (needle.length() > haystack.length()) {
            return -1;
        }
        int i = 0, j = 0;
        while (i < haystack.length() && j < needle.length()) {
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                j = next[j];
            }
        }

        if (j == needle.length()) {
            return i - j;
        } else {
            return -1;
        }

    }

    public static int[] getNext(String needle) {
        int[] next = new int[needle.length() + 1];

        next[0] = -1;
        int i = 0, j = -1;
        while (i < needle.length()) {

            if (j == -1 || needle.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                next[i] = j;
            } else {
                j = next[j];
            }

        }

        return next;

    }
}
