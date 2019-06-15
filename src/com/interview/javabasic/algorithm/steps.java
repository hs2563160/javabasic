package com.interview.javabasic.algorithm;

import java.util.concurrent.atomic.AtomicStampedReference;

public class steps {

    private static AtomicStampedReference<Integer> atomicStampedRef =
            new AtomicStampedReference<Integer>(100, 0);
    public static void main(String[] args) {


        System.out.print(JumpFloor(10));

    }

    public static  int JumpFloor(int target) {
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        //第一次有两种选择，然后根据不同的选择，然后开始不同的下一步，但是下一步还是一样有两种选择
        int a =  JumpFloor(target - 1) + JumpFloor(target - 2);

        return a ;
    }

}
