package inheritance.shape;

public class Circle extends Shape{
    protected Double radius;
    public Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
