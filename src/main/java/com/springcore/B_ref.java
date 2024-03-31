package com.springcore;

public class B_ref {
    private int value;

    @Override
    public String toString() {
        return "B_ref{" +
                "value=" + value +
                '}';
    }

    public B_ref(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public B_ref() {
    }

    public void setValue(int value) {
        this.value = value;
    }
}
