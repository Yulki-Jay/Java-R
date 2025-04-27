package com.yulki.innerclass;

public class AnimalTest {
//    public static void main(String[] args) {
//        Animal animal = new Cat();
//        animal.cry();
//    }
    public static void main(String[] args) {
        Animal cat = new Animal() {
            @Override
            public void cry() {
                System.out.println("🐱Meow");
            }
        };
        cat.cry();
    }
}

class Cat extends Animal {
    @Override
    public void cry() {
        System.out.println("🐱Meow");
    }
}
