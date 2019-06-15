package com.interview.javabasic.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FanSheTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class c = Class.forName("com.interview.javabasic.reflect.Robot");
        Constructor constructor = c.getConstructor(String.class);
        constructor.newInstance("huangshuai");
//        Robot r = (Robot) c.newInstance();
//        //Field f = c.getDeclaredField("name");
//        //f.setAccessible(true);
//        //f.set(r,"黄帅");
//        //r.sayHi("你好");
//        Method sayHi = c.getMethod("sayHi",String.class);
//        sayHi.invoke(r,"aaaaaaaaa");
//        Constructor[] constructors = c.getConstructors();
//        for (int i = 0;i<constructors.length;i++){
//
//            Class[] parameterTypes = constructors[i].getParameterTypes();
//            System.out.print("第"+i+"个构造函数");
//
//            for(int j=0;j<parameterTypes.length;j++){
//
//                System.out.print(parameterTypes[i].getName()+",");
//
//            }
//
//        }
        // System.out.print(f.get);
    }


}
