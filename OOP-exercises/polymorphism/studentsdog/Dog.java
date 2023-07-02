package polymorphism.studentsdog;

public class Dog {
    private String name;
    private String breed;
    private boolean eatsHomework;

    public Dog(String gerganaDog, String collie, boolean b) {
    }

    public Dog() {

    }

    public void Dog(String name, String breed, boolean eatsHomework) {
        this.name = name;
        this.breed = breed;
        this.eatsHomework = eatsHomework;
    }

    public void eatHomework() {
        if (eatsHomework) {
            System.out.println(name + ": Yes, I was hungry.");
        } else {
            System.out.println(name + ": No, that's not true!");
        }
    }

    public String getName() {
        return name;
    }
}
