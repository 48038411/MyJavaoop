package com.soft1841.oop.week2;

public class Circle extends Shape {
    public Circle() {
        super();
    }

    public Circle(double x, double y) {
        super(x, y);
    }
    @Override
    public void show() {
        System.out.println("圆形的面积为");
    }

    @Override
    public double getArea() {
        return super.x * super.x *super.y;
    }
}
