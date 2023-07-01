package inheritance.shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 3.0, 4.0);

        circle.display(); // Output: This is a Red shape.
        System.out.println("Circle area: " + circle.getArea()); // Output: Circle area: 78.53981633974483

        rectangle.display(); // Output: This is a Blue shape.
        System.out.println("Rectangle area: " + rectangle.getArea()); // Output: Rectangle area: 12.0
    }

}
