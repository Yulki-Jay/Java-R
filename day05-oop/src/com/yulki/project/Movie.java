package com.yulki.project;

public class Movie {
    private String name;
    private int id;
    private int price;

    public Movie() {

    }

    public Movie(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void get_info() {
        System.out.println("Movie ID: " + this.id);
        System.out.println("Movie Name: " + this.name);
        System.out.println("Movie Price: " + this.price);
    }
}
