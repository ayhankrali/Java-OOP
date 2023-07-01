package inheritance.animals.work;

public class Main {
    public static void main(String[] args) {
        Employee developer = new Developer("John Smith", 1001, 60000.0, "Java");
        Employee manager = new Manager("Jane Doe", 2001, 80000.0, 5);

        developer.displayInfo();
        developer.work();

        System.out.println();

        manager.displayInfo();
        manager.work();
    }

}
