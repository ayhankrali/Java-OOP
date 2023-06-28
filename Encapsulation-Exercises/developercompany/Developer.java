package developercompany;

public class Developer extends Employee{
    private String[] languages;

    public Developer(String name, double salary, String[] languages) {
        super(name, salary);
        this.languages = languages;
    }

    public String[] getLanguages() {
        return languages;
    }
}
