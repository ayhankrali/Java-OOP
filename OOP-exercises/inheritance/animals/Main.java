package inheritance.animals;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        Cat myCat = new Cat("Whiskers");

        myDog.makeSound();
        myCat.makeSound(); 
    }

}
