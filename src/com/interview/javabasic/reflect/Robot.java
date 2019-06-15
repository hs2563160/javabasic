package com.interview.javabasic.reflect;

public class Robot {
    private String name;
    public void sayHi(String helloSentence){
        System.out.println(helloSentence + " " + name);
    }
    private String throwHello(String tag){
        return "Hello " + tag;
    }

    public Robot(String a){

        System.out.println(a);
    }

    public Robot(){};
//
//    public Robot(int a,int b){
//
//        System.out.println(a+b);
//    }

    static {
        System.out.println("Hello Robot");
    }
}
