package com.example.demo.study.java.基础知识;

public class Son extends abstractImpl implements interfaceImpl {
    @Override
    public void method() {

    }


    public static void main(String[] args) {
        Son son = new Son();

        son.method();
        son.defaultMethod();
        interfaceImpl.staticMethod();
    }

    @Override
    public void abstractClassMethod() {

    }
}


