package Encapsulation.competition;

public class Constructor {
    private String name;
    private int wins;
    private int winningCars;

    public Constructor(String name, int wins, int winningCars) {
        this.name = name;
        this.wins = wins;
        this.winningCars = winningCars;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getWinningCars() {
        return winningCars;
    }

    public void setWinningCars(int currentWinningCars) {
    }
}
