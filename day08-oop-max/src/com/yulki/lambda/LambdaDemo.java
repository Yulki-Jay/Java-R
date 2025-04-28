package com.yulki.lambda;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo {
    public static void main(String[] args) {
        Student[] stus = new Student[5];
        stus[0] = new Student("John", 20,163.5,"male");
        stus[1] = new Student("Jane", 22,163.5,"male");
        stus[2] = new Student("Jack", 18,163.5,"male");
        stus[3] = new Student("Bob", 15,163.5,"male");
        stus[4] = new Student("Jack", 17,163.5,"male");


        for (Student stu : stus) {
            System.out.println(stu);
        }

        System.out.println("=================");

//        Arrays.sort(stus,new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

//        Arrays.sort(stus,(o1,o2) ->{
//            return o1.getAge() - o2.getAge();
//        });

        Arrays.sort(stus,( o1, o2) -> o1.getAge() - o2.getAge());

        for (Student stu : stus) {
            System.out.println(stu);
        }




    }
}
