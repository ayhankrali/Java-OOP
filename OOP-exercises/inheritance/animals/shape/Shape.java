package inheritance.animals.shape;

public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0.0;
    }

    public void display() {
        System.out.println("This is a " + color + " shape.");
    }
}
