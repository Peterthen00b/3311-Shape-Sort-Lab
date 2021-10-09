package com.company;

import java.util.List;

public class SortingTechnique {

    private SortingTechnique() {}

    public static void bubbleSort(ShapePanel sPanel) {

        List<Shape> shapes = sPanel.getShapeList();
        int totalShapes = shapes.size();

        for (int i = 0; i < totalShapes - 1; i++) {
            for (int j = 0; j < totalShapes - i - 1; j++) {
                if (shapes.get(j).compareTo(shapes.get(j + 1)) > 0) {
                    Shape dummy = shapes.get(j); //Temporary variable used for swapping
                    shapes.set(j, shapes.get(j + 1));
                    shapes.set(j + 1, dummy); //
                }
            }
        }
        repaintShapes(sPanel);
    }

    private static void repaintShapes(ShapePanel sPanel) {
        int x = ShapePanel.BUFFER;
        int y = ShapePanel.BUFFER;

        for(int i = 0; i < sPanel.getShapeList().size(); i++){
            sPanel.getShapeList().get(i).setX(x);
            sPanel.getShapeList().get(i).setY(y);

            x += sPanel.getShapeList().get(i).getWidth() + ShapePanel.BUFFER;
            y += sPanel.getShapeList().get(i).getHeight() + ShapePanel.BUFFER;
        }
        sPanel.repaint();
    }
}