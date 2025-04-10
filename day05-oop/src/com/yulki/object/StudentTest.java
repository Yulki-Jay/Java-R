package com.yulki.object;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "张三";
        student.chinese = 90;
        student.math = 95;
        student.english = 85;

        System.out.println("姓名：" + student.name + "，平均分：" + student.get_average());

    }
}
