package com.interview.javabasic.proxypattern;

public class StudentsProxy implements People {

    private Student stu;

    public StudentsProxy(People peo){

        if(peo.getClass()==Student.class){
            this.stu= (Student) peo;
        }

    }

    @Override
    public void giveMoney() {
        stu.giveMoney();
    }
}
