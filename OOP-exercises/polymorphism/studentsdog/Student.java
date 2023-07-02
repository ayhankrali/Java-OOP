package polymorphism.studentsdog;

import inheritance.animals.Dog;

import java.util.List;
import java.util.Random;

public class Student {
    private String name;
    private int age;
    private List<Integer> grades;
    private Dog pet;

    public Student(String name, int age, List<Integer> grades, Dog pet) {
        this.name = name;
        this.age = age;
        this.grades = grades;
        this.pet = pet;
    }

    public Student(String charli, int age, int i) {
    }

    public Student() {
        
    }

    public Student(String gergana, int age, List<Integer> student2Grades, polymorphism.studentsdog.Dog student2Dog) {
    }

    public void showHomework() {
        Random random = new Random();
        boolean hasHomework = random.nextBoolean();
        if (hasHomework) {
            System.out.println(name + ": This is my HW");
            checkGrade();
        } else {
            System.out.println(name + ": My dog ate it.");
            checkGrade();
        }
    }


    private void checkGrade() {
        for (int i = 0; i < grades.size(); i++) {
            int grade = grades.get(i);
            if (grade < 6) {
                grades.set(i, grade + 1);
            }
        }
    }

    public void printGrades() {
        for (int i = 0; i < grades.size(); i++) {
            System.out.println(name + " - " +  grades.get(i));
        }
    }
}
