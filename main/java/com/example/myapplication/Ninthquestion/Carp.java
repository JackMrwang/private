package com.example.myapplication.Ninthquestion;

public class Carp {
    private int id;
    private int image;
    private String num;
    private String name;
    private int price;

    public Carp(int id, int image, String num, String name, int price) {
        this.id=id;
        this.image=image;
        this.num=num;
        this.name=name;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
