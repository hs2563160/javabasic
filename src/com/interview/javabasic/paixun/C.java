package com.interview.javabasic.paixun;

class  C{
    C() {
        System.out.println("正执行SuperClass类的构造方法对成员变量初始化，为其成员变量C分配内存空间");
    }

}



class SubClass extends SuperClass{
    static{
        System.out.println("SubClass类 正在初始化");
    }
    SubClass() {
        /*在子类构造方法的第一句，隐式的调用父类的构造方法;*/
        System.out.println("正在执行子类SubClass的构造方法");
    }
    public static void main(String[] args) {
        new SubClass();
    }
}

class SuperClass {
    C c = new C();
    static{
        System.out.println("SuperClass类 正在初始化");
    }

    SuperClass() {
        this("正在调用SuperClass的有参构造方法");
        System.out.println("正在执行SuperClass的无参构造方法");
    }

    SuperClass(String s) {
        System.out.println(s);
    }
}