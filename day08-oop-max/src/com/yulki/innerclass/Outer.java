package com.yulki.innerclass;

public class Outer {
    public int age;
    class Inner {
        private String name;
        private int age;

        public Inner(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void show() {
            System.out.println("name: " + name + ", age: " + age);
            System.out.println("Outer class age: " + Outer.this.age);
        }
    }
}
