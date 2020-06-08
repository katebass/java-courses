package com.company;

/*
    Copyright: Kateryna Basova KNHUE

    Classname: Rectangle

    Module 2 Task 3. Inheritance

    1. Create a child  from the class Rectangle.

    2. Create another class as a super class for your one.  Or create a daughterly class for your one.

*/

public class Rectangle implements IGeometry{

    private double length;
    private double width;

    public final double PI = 3.14;

    public Rectangle() {
    }

    public Rectangle(double lenght, double width) {
        this.length = lenght;
        this.width = width;
    }


    @Override
    public double getVolume() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }
}
