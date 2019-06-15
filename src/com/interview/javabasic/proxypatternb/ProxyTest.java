package com.interview.javabasic.proxypatternb;

import com.interview.javabasic.proxypattern.People;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        //创建一个实例对象，这个对象是被代理的对象
        People huangshuai = new Student("huangshuai");
        //创建一个与代理对象相关了的invocationhandler
        InvocationHandler stuHandler = new StuInvocationHandler<People>(huangshuai);
        //创建一个代理对象stuProxy来代理zhangsan，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        People stuProxy = (People) Proxy.newProxyInstance
                (People.class.getClassLoader(), new Class<?>[]{People.class}, stuHandler);
        stuProxy.giveMoney();
    }
}
