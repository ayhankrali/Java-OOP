package inheritance.animals.game;

public class Player extends GameEntity {
    private int health;

    public Player(String name, int health) {
        super(name);
        this.health = health;
    }

    public void attack() {
        System.out.println(name + " is attacking!");
    }
}
