package polymorphism.studentsdog;

import java.util.List;
import java.util.Random;

public class Teacher {
    private String name;
    private int age;
    private List<String> subjects;

    public Teacher(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    public void announceCurrentSubject() {
        Random random = new Random();
        int index = random.nextInt(subjects.size());
        String currentSubject = subjects.get(index);
        System.out.println("This is " + currentSubject);
    }

    public void checkHomework(List<Student> students) {
        for (Student student : students) {
            System.out.println(name + ": Is the HW ready?");
            student.showHomework();
        }
    }
}
