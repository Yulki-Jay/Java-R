package com.yulki.operator;

public class OperatorDemo2  {
    public static void main(String[] args) {
        operator(10);
    }


    //++i, i++, --i, i--
    public static int operator(int i){
        int a = i++;
        i = 10;
        int b = ++i;
        i = 10;
        int c = i--;
        i = 10;
        int d = --i;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("d:"+d);
        return 0;
    }
}
//a:10
//b:11
//c:10
//d:9