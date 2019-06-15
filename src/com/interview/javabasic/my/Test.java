package com.interview.javabasic.my;


import java.math.BigInteger;
import java.util.Arrays;

public class Test{

    public static void main(String[] args) throws InterruptedException {

        int num1=1;
        int num2=1;
        int sum;
        System.out.print(num1+","+num2);
        for(int i=1;i<999800000;i++){

           sum=num1+num2;
           num1=num2;
           num2=sum;
            System.out.print(num2+",");

        }

    }

    //建立一个函数，用于计算数列中的每一项
    public static int fib(int num) {
        //判断：是否是第一个数和第二个数
        if(num == 1 || num == 2) {
            return 1;
        }else {
            //循环调用本函数
            return fib(num - 2) + fib(num - 1);
        }
    }
}
