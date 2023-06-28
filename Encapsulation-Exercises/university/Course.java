package university;

public class Course {
    private String name;
    private String code;
    private int creditHours;

    public Course(String name, String code, int creditHours) {
        this.name = name;
        this.code = code;
        this.creditHours = creditHours;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void updateCreditHours(int creditHours) {
        // Logic to update the credit hours of a course
    }
}
