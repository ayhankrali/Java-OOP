package inheritance.animals.work;

public class Employee {
    protected String name;
    protected int employeeID;
    protected double salary;

    public Employee(String name, int employeeID, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void work() {
        System.out.println("Employee is working.");
    }

    public void displayInfo() {
        System.out.println("Employee: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + salary);
    }
}
