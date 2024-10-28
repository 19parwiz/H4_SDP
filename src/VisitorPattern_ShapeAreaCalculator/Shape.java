package VisitorPattern_ShapeAreaCalculator;

public interface Shape {
    void accept(Visitor visitor);
}
