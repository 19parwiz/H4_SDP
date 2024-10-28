package VisitorPattern_ShapeAreaCalculator;

public class Main {
    public static void main(String[] args) {
        // Create some shapes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4);

        // Add shapes to the drawing
        Drawing drawing = new Drawing();
        drawing.addShape(circle);
        drawing.addShape(rectangle);
        drawing.addShape(triangle);

        // Create an AreaCalculator visitor
        AreaCalculator areaCalculator = new AreaCalculator();

        // Calculate areas of all shapes in the drawing
        System.out.println("Calculating areas of shapes:");
        drawing.calculateAreas(areaCalculator);
    }
}

