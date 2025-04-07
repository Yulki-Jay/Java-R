package com.yulki.literal;

public class LiteralDemo {
    public static void main(String[] args) {
        literal();
    }

    public static void literal() {
        // 整数
        int a = 10;
        System.out.println("整数: " + a);

        // 浮点数
        float b = 10.5f;
        System.out.println("浮点数: " + b);

        // 字符
        char c = 'A';
        System.out.println("字符: " + c); // 字符只能有一个

        // 字符串
        String d = "Hello World";
        System.out.println("字符串: " + d);

        // 布尔值
        boolean e = true;
        System.out.println("布尔值: " + e);

        // 十六进制整数
        int hex = 0x1A;
        System.out.println("十六进制整数: " + hex);

        // 八进制整数
//        int octal = 12;
//        System.out.println("八进制整数: " + octal);

        // 科学计数法
        double sci = 1.23e4;
        System.out.println("科学计数法: " + sci);

        char ch = 'A';
        System.out.println();

        //二进制，八进制，十进制，十六进制
        int binary = 0b1010; // 二进制
        int octal = 012; // 八进制
        int decimal = 10; // 十进制
        int hexadecimal = 0xA; // 十六进制
        System.out.println("二进制: " + binary);
        System.out.println("八进制: " + octal);
        System.out.println("十进制: " + decimal);
        System.out.println("十六进制: " + hexadecimal);
    }
}
