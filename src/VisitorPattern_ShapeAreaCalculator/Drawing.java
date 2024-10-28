package VisitorPattern_ShapeAreaCalculator;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private final List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void calculateAreas(Visitor visitor) {
        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
    }
}
