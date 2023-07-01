package inheritance.game;

public class Enemy extends GameEntity{
    private int damage;

    public Enemy(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    public void takeDamage(int amount) {
        System.out.println(name + " takes " + amount + " damage.");
    }

}
