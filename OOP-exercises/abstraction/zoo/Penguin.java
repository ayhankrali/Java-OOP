package abstraction.zoo;

public class Penguin extends Animal{
    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Honk honk!";
    }

    @Override
    public void move() {
        System.out.println("Penguin is waddling.");
    }
}
