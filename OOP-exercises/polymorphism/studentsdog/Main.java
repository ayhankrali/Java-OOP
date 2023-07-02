package polymorphism.studentsdog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> teacher1Subjects = new ArrayList<>();
        teacher1Subjects.add("Math");
        teacher1Subjects.add("Music");
        Teacher teacher1 = new Teacher("Naidenova", 57, teacher1Subjects);

        List<String> teacher2Subjects = new ArrayList<>();
        teacher2Subjects.add("Chemistry");
        Teacher teacher2 = new Teacher("Dimov", 47, teacher2Subjects);

        // Create students
        List<Integer> student1Grades = new ArrayList<>();
        student1Grades.add(4);
        student1Grades.add(6);
        student1Grades.add(5);
        Dog student1Dog = new Dog("Dog","Kangal",true);
        Student student1 = new Student();

        List<Integer> student2Grades = new ArrayList<>();
        student2Grades.add(4);
        student2Grades.add(3);
        student2Grades.add(6);
        Dog student2Dog = new Dog("GerganaDog", "Collie", true);
        Student student2 = new Student("Gergana", 13, student2Grades, student2Dog);

        List<Integer> student3Grades = new ArrayList<>();
        student3Grades.add(6);
        student3Grades.add(3);
        student3Grades.add(5);
        Dog student3Dog = new Dog();
        Student student3 = new Student("Charli",18,34);

        // Announce subjects and check homework
        teacher1.announceCurrentSubject();
        teacher1.checkHomework(List.of(student1, student2, student3));

        teacher2.announceCurrentSubject();
        teacher2.checkHomework(List.of(student1, student2, student3));

        // Print student grades
        student1.printGrades();
        student2.printGrades();
        student3.printGrades();






}
}

