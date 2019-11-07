package com.hxd.leet.code.array;

import java.util.Arrays;

/**
 * @author 黄雪冬
 * @version 0.0.1
 * @date 2019/11/4 14:33
 */
public class Merge {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);

    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int t = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            nums1[t--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }

        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);

    }
}
