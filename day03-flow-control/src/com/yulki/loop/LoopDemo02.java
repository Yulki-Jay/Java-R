package com.yulki.loop;

public class LoopDemo02 {
    public static void main(String[] args) {

        int res = loop();
        System.out.println(res);

    }

    public static int loop() {
        int mountain = 8848;
        int height = 1;
        int i = 0;
        while (height < mountain) {
            height = height * (2);
            i += 1;
        }
        return i;
    }
}
