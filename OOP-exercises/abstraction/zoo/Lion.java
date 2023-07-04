package abstraction.zoo;

public class Lion extends Animal{
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Roar!";
    }

    @Override
    public void move() {
        System.out.println("Lion is running.");
    }
}
