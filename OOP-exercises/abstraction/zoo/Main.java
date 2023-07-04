package abstraction.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Lion lion = new Lion("Simba", 5);
        Penguin penguin = new Penguin("Pingu", 2);

        zoo.addAnimal(lion);
        zoo.addAnimal(penguin);

        zoo.displayAnimalDetails();
    }

}
