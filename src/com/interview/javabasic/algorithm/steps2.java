package com.interview.javabasic.algorithm;

public class steps2 {


    public static void main(String[] args) {

        System.out.print(JumpFloor(10));

    }

    public static  int JumpFloor(int target) {
        int x = 1, y = 2, z;
        if (target == 1) {
            return 1;
        }
        if (target == 2) {
            return 2;
        }
        for (int i = 3; i <= target; i++) {
            z = y;
            y = x + y;
            x = z;
        }
        return y;

    }

}
