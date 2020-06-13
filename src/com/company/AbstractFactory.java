package com.company;

/*
    Copyright: Kateryna Basova KNHUE

    Classname: Cube

    Module 2 Task 4. Programming patterns. Factory, Builder.

    Task description: Develop Abstract factory for your class
*/

/*
    Class AbstractFactory, represents the programming pattern 'Abstract factory' for geometric figure Cube
*/

public class AbstractFactory {

    // Creation of class instance depending on requested figure
    public static IGeometry create(double sideLength, Figure figure) {
        switch (figure) {
            case RECTANGLE: return new Rectangle(sideLength, sideLength);
            case CUBE: return new Cube(sideLength);
            default: return null;
        }
    }
}
