package com.soft1841.oop.week2;

public class Rectangle extends Shape {
    public Rectangle() {
        super();
    }

    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("矩形的面积为：");
    }

    @Override
    public double getArea() {
        return super.x * super.y;
    }
}
