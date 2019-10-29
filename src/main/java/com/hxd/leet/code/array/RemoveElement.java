package com.hxd.leet.code.array;

/**
 * 27. 移除元素
 *
 * @author 黄雪冬
 * @version 0.0.1
 * @date 2019/10/29 17:42
 */
public class RemoveElement {


    public static void main(String[] args) {

        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int i = removeElement(nums, val);
        System.out.println(i);


    }

    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int x = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[x] = nums[i];
                x++;
            }
        }

        return x;

    }

}
