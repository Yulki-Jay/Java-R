package com.yulki.staticfield;

public class UserDemo {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();
        new User();
        new User();

        System.out.println(User.count);

    }

}
