package com.yulki.entendsdemo;

public class Dog extends Animal {
    public Dog(String name,int age){
        super(name,age);
    }

    public void bark(){
        System.out.println(this.getName()+" is barking");
    }

    public void eat(){
        System.out.println(this.getName()+" is eating meat");
    }
}


