package com.soft1841.oop.week2;

public final class Cube extends Rectangle {
private double height;

    public Cube() {
    }

    public Cube(double x, double y, double height) {
        super(x, y);
        this.height = height;
    }

    @Override
    public void show() {
        System.out.println("立方体的体积为");
    }
    public double getVolumn(){
        return super.getArea() * this.height;
    }
}
