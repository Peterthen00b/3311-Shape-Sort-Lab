package com.company;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape implements Comparable<Shape> {

    //Shape Variables
    private int x, y, height, width;
    private Color colour;

    //Abstract methods
    abstract public double getArea();
    abstract public void draw(Graphics g);

    //X and Y
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    //Height and Width
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    //Colour
    public Color getColour() { return colour; }
    public void setColour(Color colour) { this.colour = colour; }

    @Override
    public int compareTo(Shape o) {
        double diff = this.getArea() - o.getArea();
        if (diff < 0) {
            return -1;
        } else if (diff > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}