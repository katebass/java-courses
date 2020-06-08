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

    // create constructor without parameters
    public Rectangle() {
    }

    // create constructor with parameters
    public Rectangle(double lenght, double width) {
        this.length = lenght;
        this.width = width;
    }

    // getter for the property 'length'
    public double getLength() {
        return length;
    }

    // setter for the property 'length'
    public void setLength(double length) {
        this.length = length;
    }

    // // getter for the property 'width'
    public double getWidth() {
        return width;
    }

    // setter for the property 'width'
    public void setWidth(double width) {
        this.width = width;
    }

    // getter for the property 'PI'
    public double getPI() {
        return PI;
    }

    // Override getVolume() method
    @Override
    public double getVolume() {
        return this.length * this.width;
    }

    // Override getPerimeter() method
    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }
}
