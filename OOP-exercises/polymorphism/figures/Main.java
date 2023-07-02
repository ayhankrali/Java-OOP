package polymorphism.figures;

public class Main {
    public static void main(String[] args) {
        Figure triangle = new Triangle(new int[]{3, 4, 5}, "Triangle");
        Figure tetragon = new Tetragon(new int[]{6, 7, 8, 9}, "Tetragon");
        Figure pentagon = new Pentagon(new int[]{10, 11, 12, 13, 14}, "Pentagon");

        triangle.sayType();
        tetragon.sayType();
        pentagon.sayType();
    }
}
