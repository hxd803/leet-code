package com.hxd.leet.code.array;

/**
 * @author 黄雪冬
 * @version 0.0.1
 * @date 2019/11/4 13:52
 */
public class PlusOne {

    public static void main(String[] args) {

        int[] nums = new int[]{8, 4, 9, 9};
        int[] i = plusOne(nums);
        System.out.println(i.length);


    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

//        boolean isNeedAddOne = true;
//        for (int digit : digits) {
//            if (digit != 9) {
//                isNeedAddOne = false;
//                break;
//            }
//        }
//
//        int[] temp;
//        if (isNeedAddOne) {
//            temp = new int[digits.length + 1];
//        } else {
//            temp = new int[digits.length];
//        }
//        boolean isOverTen = false;
//        for (int i = digits.length - 1; i >= 0; i--) {
//
//            if (i == digits.length - 1) {
//                if (digits[i] + 1 == 10) {
//                    isOverTen = true;
//                    if (isNeedAddOne) {
//                        temp[i + 1] = 0;
//                    } else {
//                        temp[i] = 0;
//                    }
//                } else {
//                    if (isNeedAddOne) {
//                        temp[i + 1] = digits[i] + 1;
//                    } else {
//                        temp[i] = digits[i] + 1;
//                    }
//                }
//            } else {
//                if (isOverTen) {
//                    if (digits[i] + 1 == 10) {
//
//                        if (isNeedAddOne) {
//                            temp[i + 1] = 0;
//                        } else {
//                            temp[i] = 0;
//                        }
//                    } else {
//                        isOverTen = false;
//                        if (isNeedAddOne) {
//                            temp[i + 1] = digits[i] + 1;
//                        } else {
//                            temp[i] = digits[i] + 1;
//                        }
//                    }
//                } else {
//                    if (isNeedAddOne) {
//                        temp[i + 1] = digits[i];
//                    } else {
//                        temp[i] = digits[i];
//                    }
//                }
//
//            }
//        }
//        if (isOverTen && isNeedAddOne) {
//            temp[0] = 1;
//        }
//        return temp;
    }
}
