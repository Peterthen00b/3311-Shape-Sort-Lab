package com.company;

import java.awt.*;

public class Circle extends Shape{
    public Circle(int x, int y, int radius, Color colour){
        this.setX(x);
        this.setY(y);
        this.setWidth(radius);
        this.setHeight(radius);
        this.setColour(colour);
    }

    @Override
    public void setHeight(int radius){
        super.setWidth(radius);
    }

    @Override
    public void setWidth(int radius){
        super.setHeight(radius);
        super.setWidth(radius);
    }

    @Override
    public double getArea(){ return Math.PI * (Math.pow((getWidth() / 2.0), 2)); }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(this.getColour());
        g2d.fillOval(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}

