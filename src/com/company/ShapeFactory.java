package com.company;

import java.awt.Color;
import java.util.Random;

public class ShapeFactory {

    public Shape createShape(String name, int x, int y) {

        //Variables
        int width, height;
        int minSize = 50;
        int maxSize = 80;
        int circleSizeMax = 75;
        int circleSizeMin = 50;
        Random rand = new Random();

        Color colour = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        Shape shape = null;

        if(name.equals("Circle"))
        {
            width = rand.nextInt(circleSizeMax - circleSizeMin) + circleSizeMin;
            shape = new Circle(x, y, width, colour);
            System.out.println("A " + name + " was created with an area of " + (int) shape.getArea());
        }

        else if(name.equals("Square"))
        {
            width = rand.nextInt(maxSize - minSize) + minSize;
            shape = new Square(x, y, width, colour);
            System.out.println("A " + name + " was created with an area of " + (int) shape.getArea());
        }

        else if(name.equals("Rectangle"))
        {
            width = rand.nextInt(maxSize - minSize) + minSize;
            height = rand.nextInt(maxSize - minSize) + minSize;
            shape = new Rectangle(x, y, width, height, colour);
            System.out.println("A " + name + " was created with an area of " + (int) shape.getArea());
        }
        return shape;
    }
}