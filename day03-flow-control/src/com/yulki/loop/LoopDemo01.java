package com.yulki.loop;

public class LoopDemo01 {
    public static void main(String[] args) {
        System.out.println(loop(10));
    }

    public static int loop(int bound) {
        int res = 0;
        for(int i=0; i<=bound; i++) {
            res += i;
        }
        return res;
    }
}
