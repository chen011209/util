package com.example.demo.util.jsonUtil;

public class A {
    String a;
    Integer i;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + '\'' +
                ", i=" + i +
                '}';
    }

    public A(String a, Integer i) {
        this.a = a;
        this.i = i;
    }
}
