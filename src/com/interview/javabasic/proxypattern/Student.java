package com.interview.javabasic.proxypattern;

public class Student implements People {

    private String name;

    public Student(String name){

        this.name=name;

    }

    @Override
    public void giveMoney() {

        System.out.print(name+"---"+"上交学费");

    }
}
