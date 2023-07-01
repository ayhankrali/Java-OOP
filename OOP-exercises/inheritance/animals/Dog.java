package inheritance.animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("The dog barks.");
    }
}
