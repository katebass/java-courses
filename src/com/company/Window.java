package com.company;

/*
    Copyright: Kateryna Basova KNHUE

    Classname: Window

    Module 2 Task 3. Inheritance

    1. Create a child  from the class Rectangle.

    2. Create another class as a super class for your one. Or create a daughterly class for your one.

*/

// Current class extends class Rectangle and can use all methods and properties which Rectange has
public class Window extends Rectangle{
    // properties for the class Window
    private double price;
    private String color;
    private String material;
    private int sectionsAmount;
    private boolean canBeOpen;

    // create constructor only with own parameters
    public Window(double price, String color, String material, int sectionsNumber, boolean canBeOpen) {
        this.price = price;
        this.color = color;
        this.material = material;
        this.sectionsAmount = sectionsNumber;
        this.canBeOpen = canBeOpen;
    }

    // create constructor with parent parameters and own parameters
    public Window(double lenght, double width, double price, String color, String material, int sectionsNumber, boolean canBeOpen) {
        super(lenght, width);
        this.price = price;
        this.color = color;
        this.material = material;
        this.sectionsAmount = sectionsNumber;
        this.canBeOpen = canBeOpen;
    }

    // getter for the property 'price'
    public double getPrice() {
        return price;
    }

    // setter for the property 'price'
    public void setPrice(double price) {
        this.price = price;
    }

    // getter for the property 'color'
    public String getColor() {
        return color;
    }

    // setter for the property 'color'
    public void setColor(String color) {
        this.color = color;
    }

    // getter for the property 'material'
    public String getMaterial() {
        return material;
    }

    // setter for the property 'material'
    public void setMaterial(String material) {
        this.material = material;
    }

    // getter for the property 'sectionsAmount'
    public int getSectionsAmount() {
        return sectionsAmount;
    }

    // setter for the property 'sectionsAmount'
    public void setSectionsAmount(int sectionsNumber) {
        this.sectionsAmount = sectionsNumber;
    }

    // getter for the property 'canBeOpen'
    public boolean isCanBeOpen() {
        return canBeOpen;
    }

    // setter for the property 'canBeOpen'
    public void setCanBeOpen(boolean canBeOpen) {
        this.canBeOpen = canBeOpen;
    }

    // override method ToString
    @Override
    public String toString() {
        return "Window{" +
                "length=" + super.getLength() +
                "width=" + super.getWidth() +
                "volume=" + super.getVolume() +
                "price=" + price +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", sectionsAmount=" + sectionsAmount +
                ", canBeOpen=" + canBeOpen +
                ", PI=" + PI +
                '}';
    }
}
