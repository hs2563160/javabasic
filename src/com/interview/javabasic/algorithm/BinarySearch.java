package com.interview.javabasic.algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arrays = new int[]{1,2,3,4,6,6,7,7,8,9,10};
        int target = 7;
        System.out.println(search(arrays, target, 0, arrays.length));
    }

    public static String search(int[] arrays, int target, int head, int tail) {
        int center = (head + tail) / 2;
        if (center < 0 || center > arrays.length - 1) {
            return "No result.";
        }
        if (target == arrays[center]) {
            String rst = "Result location = " + (center + 1);// 结果1

            // BEGIN-结果1前后是否有相等的结果
            int index = center;
            do {
                if(target == arrays[--index]) {
                    rst += ", " + (index + 1);
                } else {
                    break;
                }
            } while(index >= head);
            do {
                if(target == arrays[++center]) {
                    rst += ", " + (center + 1);
                } else {
                    break;
                }
            } while(center <= tail);
            // END-结果1前后是否有相等的结果

            return rst;
        } else if (target < arrays[center]) {
            return search(arrays, target, head, center - 1);
        } else if (target > arrays[center]) {
            return search(arrays, target, center + 1, tail);
        } else {
            return "No result.";
        }
    }
}

