package polymorphism.stringmanipulator;

public class Main {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator("example");

        System.out.println(manipulator.toLowerCase());
        System.out.println(manipulator.toUpperCase());
        System.out.println(manipulator.capitalize());
        System.out.println(manipulator.separateLetters());

        manipulator.printLetterAtPosition(2);
        manipulator.printLetterAtPosition(10);
    }
}


