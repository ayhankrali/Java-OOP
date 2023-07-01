package encapsulation.competition;

public class Pilot {
    private String name;
    private int wins;
    private int yearsOfExperience;

    public Pilot(String name, int wins, int yearsOfExperience) {
        this.name = name;
        this.wins = wins;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setWins(int currentWins) {
    }
}
