package com.company;

/**
 * @author Kateryna Basova KNHUE
 * @version 1.0
 * Classname AbstractFactory
 * Class represents the programming pattern 'Abstract factory' for geometric figure Cube

    Module 2 Task 4. Programming patterns. Factory, Builder.

    Task description: Develop Abstract factory for your class
**/
public class AbstractFactory {
    /**
     * Class constructor with parameters
     * Creates a class instance depending on requested figure
     * @param sideLength set a side of a cube
     * @param figure specifies which figure should be created
     **/
    public static IGeometry create(double sideLength, Figure figure) {
        switch (figure) {
            case RECTANGLE: return new Rectangle(sideLength, sideLength);
            case CUBE: return new Cube(sideLength);
            default: return null;
        }
    }
}
