package inheritance.animals.work;

public class Manager extends Employee{
    private int numProjectsManaged;

    public Manager(String name, int employeeID, double salary, int numProjectsManaged) {
        super(name, employeeID, salary);
        this.numProjectsManaged = numProjectsManaged;
    }

    @Override
    public void work() {
        System.out.println(name + " is managing " + numProjectsManaged + " projects");
    }
}
