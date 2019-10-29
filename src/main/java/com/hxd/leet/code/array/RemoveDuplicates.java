package com.hxd.leet.code.array;

/**
 * 26. 删除排序数组中的重复项
 *
 * @author 黄雪冬
 * @version 0.0.1
 * @date 2019/10/29 17:32
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int x = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[x] != nums[i]) {
                x++;
                nums[x] = nums[i];
            }

        }
        return x + 1;
    }

}
