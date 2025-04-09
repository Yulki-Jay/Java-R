package com.yulki.array;

import java.util.Random;

public class ArrayDemo01 {
    public static void main(String[] args) {
        randomCall();
    }

    public static void randomCall() {
        Random random = new Random();
        String[] names = new String[]{"张三", "李四", "王五", "赵六", "钱七"};
        int index = (int)(random.nextInt(names.length));
        System.out.println(names[index]);
    }

}
