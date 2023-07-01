package Encapsulation.competition.figure;

public class Main {
    public static void main(String[] args) {
        Box cube1 = new Box(5, 5, 5);
        Box cube2 = new Box(0, 0, 0);
        Box parallelepiped1 = new Box(10, 5, 2);
        Box parallelepiped2 = new Box(10, -2, 3);

        cube1.printBox();
        cube2.printBox();
        parallelepiped1.printBox();
        parallelepiped2.printBox();
    }
}

