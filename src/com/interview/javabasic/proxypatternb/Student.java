package com.interview.javabasic.proxypatternb;

import com.interview.javabasic.proxypattern.People;

public class Student implements People {

    private String name;

    public Student(String name){

        this.name=name;
    }


    @Override
    public void giveMoney() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(name+"---"+"上交学费");
    }
}
