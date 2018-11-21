package com.soft1841.oop.week1;

public class Rectangel extends Shape {
    @Override
    public void getArea() {
        super.getArea();
        int width = 10;
        int height = 5;
        System.out.println(width*height);
    }
}
