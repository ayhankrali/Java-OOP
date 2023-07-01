package inheritance.work;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, int employeeID, double salary, String programmingLanguage) {
        super(name, employeeID, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(name + " is coding in " + programmingLanguage);
    }
}
