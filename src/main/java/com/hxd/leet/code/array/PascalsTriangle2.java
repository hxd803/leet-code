package com.hxd.leet.code.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 黄雪冬
 * @version 0.0.1
 * @date 2019/11/4 14:50
 */
public class PascalsTriangle2 {


    public static void main(String[] args) {
        List<Integer> generate = getRow(33);
        System.out.println(generate);
    }


    public static List<Integer> generate(int rowIndex) {

        List<List<Integer>> total = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
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
        return total.get(rowIndex);
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long pre = 1;
        ans.add(1);
        for (int k = 1; k <= rowIndex; k++) {
            long cur = pre * (rowIndex - k + 1) / k;
            ans.add((int) cur);
            pre = cur;
        }
        return ans;
    }
}
