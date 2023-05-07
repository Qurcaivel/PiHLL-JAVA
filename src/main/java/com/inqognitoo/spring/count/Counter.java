package com.inqognitoo.spring.count;

// almost atomic but synchronized :|
public class Counter {

    private long count = 0;

    public long get(){
        return count;
    }

    public synchronized void increment(){
        ++count;
    }
}
