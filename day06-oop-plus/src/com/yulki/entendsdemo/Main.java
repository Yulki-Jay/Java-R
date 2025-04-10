package com.yulki.entendsdemo;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("dog", 2);
        Cat cat = new Cat("cat",10);

        dog.eat();
        dog.bark();
        System.out.println("=============");
        cat.eat();
        cat.bark();

    }
}
