package VisitorPattern_ShapeAreaCalculator;

public interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
    void visit(Triangle triangle);
}
