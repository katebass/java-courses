package com.company;

/*
    Class Main
    Modules: all

    Copyright --- Kateryna Basova KNHUE
*/

public class Main {

    public static void main(String[] args) {
        // create an instance of the class Cube
        Cube cube1 = new Cube(5);
        // call one of methods for class instance
        // cube1.toConsole();

        // Create cube instance via AbstractFactory
        IGeometry cube2 = AbstractFactory.create(10, Figure.CUBE);
        System.out.println(cube2.getPerimeter());
    }
}
