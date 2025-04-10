package com.yulki.entendsdemo;

public class Cat extends Animal {
    public Cat(String name,int age){
        super(name,age);
    }

    public void bark(){
        System.out.println(this.getName()+" is meowing");
    }

    public void eat(){
        System.out.println(this.getName()+" is eating fish");
    }
}
