package inheritance.game;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Player 1", 100);
        player.update();
        player.attack();

        System.out.println();

        Enemy enemy = new Enemy("Enemy 1", 50);
        enemy.update();
        enemy.takeDamage(20);
    }

}
