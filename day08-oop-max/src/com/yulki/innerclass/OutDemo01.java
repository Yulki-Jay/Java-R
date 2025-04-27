package com.yulki.innerclass;

public class OutDemo01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.age = 30;
        Outer.Inner inner = outer.new Inner("John", 25);
        inner.show();
    }
}
