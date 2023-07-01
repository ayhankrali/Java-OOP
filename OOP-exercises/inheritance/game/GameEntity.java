package inheritance.game;

public class GameEntity {
    protected String name;

    public GameEntity(String name) {
        this.name = name;
    }

    public void update() {
        System.out.println("Updating entity: " + name);
    }
}
