package com.springcore;

public class A_ref {
    private int value;

    private B_ref obj;

    @Override
    public String toString() {
        return "A_ref{" +
                "value=" + value +
                ", obj=" + obj +
                '}';
    }

    public A_ref() {
    }

    public A_ref(int value, B_ref obj) {
        this.value = value;
        this.obj = obj;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public B_ref getObj() {
        return obj;
    }

    public void setObj(B_ref obj) {
        this.obj = obj;
    }
}
