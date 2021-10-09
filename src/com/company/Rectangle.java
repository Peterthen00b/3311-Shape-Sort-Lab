package com.company;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rectangle extends Shape {

    public Rectangle(int x, int y, int width, int height, Color colour){
        this.setX(x);
        this.setY(y);
        this.setWidth(width);
        this.setHeight(height);
        this.setColour(colour);
    }

    @Override
    public double getArea(){ return this.getWidth() * this.getHeight(); }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(this.getColour());
        g2d.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}