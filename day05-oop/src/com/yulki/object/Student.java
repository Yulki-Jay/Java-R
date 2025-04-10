package com.yulki.object;

public class Student {
    public String name;
    public int chinese;
    public int math;
    public int english;

    public double get_average() {
        return (this.chinese + this.math + this.english) / 3.0;
    }
}
