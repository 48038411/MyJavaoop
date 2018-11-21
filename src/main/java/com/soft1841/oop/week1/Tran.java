package com.soft1841.oop.week1;

public class Tran extends Vehicle{
    @Override
    public void move() {
        super.move();
        System.out.println("火车在铁轨上行驶");
    }
}
