package com.yulki.abstractdemo;

public abstract class A {
    private String name;
    private int age;

    public A() {}

    public A(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public abstract void show();

    public void show1(){
        System.out.println("show1");
    }
}
