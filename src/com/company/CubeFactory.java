package com.company;

/*
    Copyright: Kateryna Basova KNHUE

    Classname: Cube

    Module 2 Task 4. Programming patterns. Factory, Builder.

    Task description: Develop Factory for your class
*/

/*
    Class CubeFactory, represents the programming pattern 'Factory' for geometric figure Cube.
*/
public class CubeFactory {

    // Constructor for class instance Cube. If the entered side length is less than 0,
    // it's not possible to create a cube. Otherwise a class instance will be created.
    public static Cube create(double sideLength) {
        if (sideLength > 0) {
            return new Cube(sideLength);
        } return null;
    }

}
