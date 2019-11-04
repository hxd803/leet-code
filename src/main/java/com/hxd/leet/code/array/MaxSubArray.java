package com.hxd.leet.code.array;

/**
 * @author 黄雪冬
 * @version 0.0.1
 * @date 2019/10/29 18:21
 */
public class MaxSubArray {

    public static void main(String[] args) {

        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i = maxSubArray(nums);
        System.out.println(i);


    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            max = Math.max(max, sum);
        }

        return max;
    }
}
