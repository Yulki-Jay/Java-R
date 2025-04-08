package com.yulki.branch;

import java.util.Scanner;

public class switchDemo {
    public static void main(String[] args) {
        switchtest();
    }
    
    public static void switchtest() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        switch (str) {
            case "男":
                System.out.println("男生哦");
                break;
            case "女":
                System.out.println("女生哦");

        }
    }
}

