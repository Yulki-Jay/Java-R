package com.yulki.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // 输入demo
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String name = scanner.nextLine();
        System.out.println("name:"+name);

        int age = scanner.nextInt();
        System.out.println("age:"+age);
    }
}
