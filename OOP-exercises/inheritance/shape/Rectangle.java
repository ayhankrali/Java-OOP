package inheritance.shape;

public class Rectangle extends Shape{
    protected double width;
    protected double height;


    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

