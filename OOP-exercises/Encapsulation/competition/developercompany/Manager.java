package Encapsulation.competition.developercompany;

public class Manager extends Employee{
    private int numberOfSubordinates;

    public Manager(String name, double salary, int numberOfSubordinates) {
        super(name, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
}
