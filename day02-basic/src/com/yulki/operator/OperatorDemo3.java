package com.yulki.operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        logicOperatorTest();
        logicOperatorTest1();
    }

    //逻辑运算符测试 & ｜ ^
    public static void logicOperatorTest() {
        int x = 5;    // 二进制：0101
        int y = 3;    // 二进制：0011
        System.out.println(x & y);  // 输出：1 (0001)
        System.out.println(x | y);  // 输出：7 (0111)
        System.out.println(x ^ y);  // 输出：6 (0110)
        System.out.println(~x);     // 输出：-6
    }

    public static void logicOperatorTest1() {
        // 逻辑运算符示例
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);  // false
        System.out.println(a || b);  // true
        System.out.println(!a);      // false
    }

}
