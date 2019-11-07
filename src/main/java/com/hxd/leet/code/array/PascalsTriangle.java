package com.hxd.leet.code.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 黄雪冬
 * @version 0.0.1
 * @date 2019/11/4 14:50
 */
public class PascalsTriangle {


    public static void main(String[] args) {
        List<List<Integer>> generate = generate(5);
        System.out.println(generate);
    }


    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> total = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    row.add(1);
                } else {
                    row.add(total.get(i - 1).get(j) + total.get(i - 1).get(j - 1));
                }
            }
            total.add(row);

        }
        return total;
    }
}
