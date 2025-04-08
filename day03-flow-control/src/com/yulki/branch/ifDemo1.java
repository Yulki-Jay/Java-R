package com.yulki.branch;

public class ifDemo1 {
    public static void main(String[] args) {
        test(10);
    }

    public static void test(int age){
        if(age>18){
            System.out.println("adult");
        }else{
            System.out.println("child");
        }
    }
}
