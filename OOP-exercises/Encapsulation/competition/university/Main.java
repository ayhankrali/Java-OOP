package Encapsulation.competition.university;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        University university = new University("ABC University");

        Student student1 = new Student("John", 20, "S001");
        Student student2 = new Student("Alice", 22, "S002");

        Course course1 = new Course("Mathematics", "MATH101", 3);
        Course course2 = new Course("Physics", "PHYS101", 4);

        university.addStudent(student1);
        university.addStudent(student2);

        university.addCourse(course1);
        university.addCourse(course2);

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);

        student2.enrollCourse(course1);

        // ... perform other operations ...

        List<Student> students = university.getStudents();
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + " (" + student.getId() + ")");
            System.out.println("Enrolled Courses: " + student.getId());
        }
    }
}
