package com.soft1841.oop.week2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Triangle(4.0,3.0);
        shape.show();
        System.out.println(shape.getArea());
        Shape shape1 = new Rectangle(5.0,3.0);
        shape1.show();
        System.out.println(shape1.getArea());
        Shape shape2 = new Circle(2.0,3.14);
        shape2.show();
        System.out.println(shape2.getArea());
        Shape shape3 = new Cube(3.0,4.0,5.0);
        shape3.show();
        System.out.println(((Cube) shape3).getVolumn());
    }
}
