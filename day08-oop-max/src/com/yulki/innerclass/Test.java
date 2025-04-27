package com.yulki.innerclass;

public class Test {
    public static void main(String[] args) {
        Swim stu = new Swim() {
            @Override
            public void swimming() {
                System.out.println("Swimming in the pool");
            }
        };
        start(stu);
        System.out.println("==============================");
        start(new Swim() {
            @Override
            public void swimming() {
                System.out.println("Swimming in the sea");
            }
        });
    }


    public static void start(Swim s) {
        s.swimming();
    }


}




interface Swim {
    void swimming();
}