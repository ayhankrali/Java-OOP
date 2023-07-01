package encapsulation.university;

public class Student {
    private String name;
    private int age;
    private String id;

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public void enrollCourse(Course course) {
        // Logic to enroll the student in a course
    }

    public void dropCourse(Course course) {
        // Logic to drop a course for the student
    }

}
