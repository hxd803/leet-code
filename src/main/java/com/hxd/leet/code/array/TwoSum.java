package com.hxd.leet.code.array;

import com.google.common.base.Stopwatch;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 1. 两数之和
 *
 * @author 黄雪冬
 * @version 0.0.1
 * @date 2019/10/29 16:36
 */
public class TwoSum {

    public static void main(String[] args) {
        Stopwatch stopwatch = Stopwatch.createStarted();


        System.out.println(stopwatch.elapsed(TimeUnit.MILLISECONDS));

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(sub, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
