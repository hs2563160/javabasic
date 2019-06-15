package com.interview.javabasic.my;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class MyCopyAndWriteListTwo {

    private ReentrantLock reentrantLock = new ReentrantLock();

    private volatile Object[] objects;

    public MyCopyAndWriteListTwo(){

        objects=new Object[0];
    }

    private void setArray(Object[] objects){

        this.objects=objects;
    }

    private Object[] getArray(){

        return this.objects;
    }

    public void add(Object object){

        this.reentrantLock.lock();
        try {

            Object[] elements = getArray();
            int length = elements.length;
            Object[] newelements = Arrays.copyOf(elements,length+1);
            newelements[length]=object;
            setArray(newelements);

        }finally {
            this.reentrantLock.unlock();
        }
    }

    public Object get(int index){

        return getArray()[index];
    }
}
