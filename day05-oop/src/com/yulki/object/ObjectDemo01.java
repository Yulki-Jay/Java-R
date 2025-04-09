package com.yulki.object;

public class ObjectDemo01 {
    public static void main(String[] args) {
        Star star = new Star();
        star.name = "张三";
        star.age = 18;
        star.gender = "男";
        star.phone = "12345678901";

        System.out.println("姓名：" + star.name);
        System.out.println("年龄：" + star.age);
        System.out.println("性别：" + star.gender);

    }
}

