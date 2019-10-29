package com.hxd.leet.code.array;

/**
 * 35. 搜索插入位置
 *
 * @author 黄雪冬
 * @version 0.0.1
 * @date 2019/10/29 17:55
 */
public class SearchInsert {


    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 5, 6};
        int val = 7;
        int i = searchInsert(nums, val);
        System.out.println(i);


    }

    public static int searchInsert(int[] nums, int target) {


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }
}
