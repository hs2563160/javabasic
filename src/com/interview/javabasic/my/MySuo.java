package com.interview.javabasic.my;

public class MySuo {


    public synchronized  void test1() throws InterruptedException {

        Thread.sleep(10000);
        System.out.println("11111111111111111111111111");
    }


    public synchronized  void test2(){

        System.out.println("22222222222222222222222222");
    }

}
