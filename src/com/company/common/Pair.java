package com.company.common;

public class Pair<T, R> {
    private T val1;
    private R val2;

    public Pair(T val1, R val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1(){
        return val1;
    }

    public R getVal2(){
        return val2;
    }

}
