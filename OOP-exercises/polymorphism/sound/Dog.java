package polymorphism.sound;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Chirp!");
    }
}
