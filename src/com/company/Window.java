package com.company;

/*
    Copyright: Kateryna Basova KNHUE

    Classname: Window

    Module 2 Task 3. Inheritance

    1. Create a child  from the class Rectangle.

    2. Create another class as a super class for your one.  Or create a daughterly class for your one.

*/

// Current class extends class Rectangle and can use all methods which Rectange has
public class Window extends Rectangle{

    private double price;
    private String color;
    private String material;
    private int sectionsNumber;
    private boolean canBeOpen;

    public Window(double price, String color, String material, int sectionsNumber, boolean canBeOpen) {
        this.price = price;
        this.color = color;
        this.material = material;
        this.sectionsNumber = sectionsNumber;
        this.canBeOpen = canBeOpen;
    }


}
