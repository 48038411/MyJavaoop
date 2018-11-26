package com.soft1841.oop.week2;

public abstract class Shape {
    protected double x;
    protected double y;

    public Shape() {
    }

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //声明了一个非抽象方法，带方法体
    public void show(){
        System.out.println("面积为");
    }
    //声明了一个抽象方法，不能带方法体
    public abstract double getArea();
}
