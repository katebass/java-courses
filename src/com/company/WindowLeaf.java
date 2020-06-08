package com.company;

/*
    Copyright: Kateryna Basova KNHUE

    Classname: WindowLeaf

    Module 2 Task 3. Inheritance

    1. Create a child  from the class Rectangle.

    2. Create another class as a super class for your one. Or create a daughterly class for your one.

*/

// Current class extends class Window and can use all methods and properties which Window has
public class WindowLeaf extends Window{
    // properties of handle which allows to open a window leaf
    private double handleWidth;
    private double handleHeight;

    // create constructor only with own parameters
    public WindowLeaf(double price, String color, String material, int sectionsAmount, boolean canBeOpen, double handleWidth, double handleHeight) {
        super(price, color, material, sectionsAmount, canBeOpen);
        this.handleWidth = handleWidth;
        this.handleHeight = handleHeight;
    }

    // create constructor with parent parameters and own parameters
    public WindowLeaf(double lenght, double width, double price, String color, String material, int sectionsAmount, boolean canBeOpen, double handleWidth, double handleHeight) {
        super(lenght, width, price, color, material, sectionsAmount, canBeOpen);
        this.handleWidth = handleWidth;
        this.handleHeight = handleHeight;
    }

    // getter for the property 'hendleWidth'
    public double getHandleWidth() {
        return handleWidth;
    }

    // setter for the property 'hendleWidth'
    public void setHandleWidth(double handleWidth) {
        this.handleWidth = handleWidth;
    }

    // getter for the property 'hendleHeight'
    public double getHandleHeight() {
        return handleHeight;
    }

    // setter for the property 'hendleHeight'
    public void setHandleHeight(double handleHeight) {
        this.handleHeight = handleHeight;
    }
}
