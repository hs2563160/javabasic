package com.interview.javabasic.proxypattern;

public class StaticProxyTest {

    public static void main(String[] args) {

        People stu = new Student("huangshuai");
        People stupro = new StudentsProxy(stu);
        stupro.giveMoney();
    }

}
