package com.hxd.leet.code.array;

/**
 * @author 黄雪冬
 * @version 0.0.1
 * @date 2019/10/29 18:21
 */
public class MaxSubArray {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 5, 6};
        int i = maxSubArray(nums);
        System.out.println(i);


    }

    public static int maxSubArray(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int max = nums[i];
            for (int j = 1; j < nums.length; j++) {

            }
        }

        return 0;
    }
}
