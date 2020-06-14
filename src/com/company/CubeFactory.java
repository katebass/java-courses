package com.company;

/**
 * @author Kateryna Basova KNHUE
 * @version 1.0
 * Classname: CubeFactory
 * Class represents the programming pattern 'Factory' for geometric figure Cube.

    Module 2 Task 4. Programming patterns. Factory, Builder.

    Task description: Develop Factory for your class
**/
public class CubeFactory {
    /**
     * Class constructor with parameters. If the entered side length is less than 0,
     * it's not possible to create a cube. Otherwise a class instance will be created.
     * @param sideLength set a side of a cube
     **/
    public static Cube create(double sideLength) {
        if (sideLength > 0) {
            return new Cube(sideLength);
        } return null;
    }

}