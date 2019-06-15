package com.interview.javabasic.my;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class MyCopyAndWriteList {

    private ReentrantLock lock = new ReentrantLock();

    private volatile Object[] objects;

    public MyCopyAndWriteList(){

         setArray(new Object[0]);
    }

    private final void setArray(Object[] objects){

        this.objects=objects;
    }
    private final Object[] getArray(){

        return objects;
    }

    public boolean add(Object o){

       final ReentrantLock lock = this.lock;
       lock.lock();
       try{
           Object[] elements = getArray();
           int length = elements.length;
           Object[] newelements = Arrays.copyOf(elements,length+1);
           newelements[length]=o;
           setArray(newelements);
           return true;
       }finally {
           lock.unlock();
       }

    }

    public Object get(int index){

        return this.getArray()[index];
    }
}
