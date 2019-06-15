package com.interview.javabasic.my;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class MyQueueTwo {

    private final LinkedList linkedList = new LinkedList();

    private AtomicInteger atomicInteger = new AtomicInteger(0);


    private int maxsize;

    private Object lock = new Object();


    public int getSize() {

        return atomicInteger.get();
    }

    public MyQueueTwo() {
        this(10);
    }

    public MyQueueTwo(int size) {
        this.maxsize = size;
    }

    public void put(Object object) throws InterruptedException {

        synchronized (lock) {

            while (getSize() == maxsize) {

                lock.wait();
            }

            linkedList.push(object);
            atomicInteger.incrementAndGet();
            lock.notify();
        }

    }

    public Object get() throws InterruptedException {

        synchronized (lock) {

            while (getSize() == 0) {
                lock.wait();
            }
            Object o = linkedList.pop();
            atomicInteger.decrementAndGet();
            lock.notify();
            return o;
        }

    }

}
