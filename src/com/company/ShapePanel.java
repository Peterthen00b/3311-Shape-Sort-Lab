package com.company;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class ShapePanel extends JPanel {

    private static final ShapePanel instance = new ShapePanel();
    public static final int BUFFER = 10;
    private final List<Shape> shapeList = new ArrayList<Shape>();

    private ShapePanel() {}

    public static ShapePanel getInstance() {
        return instance;
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i = 0; i < shapeList.size(); i++){
            Shape shape = shapeList.get(i);
            shape.draw(g);
        }
    }
}
