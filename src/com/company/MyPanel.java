package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener {

    private static final int NUMBER_OF_SHAPES = 6;
    private static final MyPanel instance = new MyPanel(ShapePanel.getInstance());

    private final JButton loadShapes;
    private final JButton sortShapes;
    private final ShapePanel shapePanel;

    private MyPanel(ShapePanel sPanel){

        //Load Shapes Button setup
        loadShapes = new JButton();
        loadShapes.addActionListener(this);
        loadShapes.setActionCommand("Load Shapes");
        loadShapes.setText("Load Shapes");
        this.add(loadShapes);

        //Sort Shapes Button setup
        sortShapes = new JButton();
        sortShapes.addActionListener(this);
        sortShapes.setActionCommand("Sort Shapes");
        sortShapes.setText("Sort Shapes");
        sortShapes.setEnabled(false);
        this.add(sortShapes);

        this.shapePanel = sPanel;
    }

    public static MyPanel getInstance(){
        return instance;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == loadShapes) {
            generateShapes(shapePanel);
            sortShapes.setEnabled(true);
        }else if (e.getSource() == sortShapes){
            SortingTechnique.bubbleSort(shapePanel);
            sortShapes.setEnabled(false);
        }
    }

    private void generateShapes(ShapePanel sPanel){
        String name;
        ShapeFactory factory = new ShapeFactory();
        Random rand = new Random();

        int x = ShapePanel.BUFFER;
        int y = ShapePanel.BUFFER;

        sPanel.getShapeList().clear();

        for(int i = 0; i < NUMBER_OF_SHAPES; i++){
            int shapeChoice = rand.nextInt(3) + 1;
            if(shapeChoice == 1){
                name = "Circle";
            }else if(shapeChoice == 2){
                name = "Square";
            }else{
                name = "Rectangle";
            }

            //Creates the shape based on name and x and y position
            Shape shape = factory.createShape(name, x, y);
            x += shape.getWidth() + ShapePanel.BUFFER;
            y += shape.getHeight() + ShapePanel.BUFFER;
            sPanel.getShapeList().add(shape);
        }
        sPanel.repaint();
    }
}