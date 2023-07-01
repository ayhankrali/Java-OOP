package encapsulation.competition;

public class Team {
    private String teamName;
    private Pilot pilot;
    private Constructor constructor;
    private int points;

    public Team(String teamName, Pilot pilot, Constructor constructor, int points) {
        this.teamName = teamName;
        this.pilot = pilot;
        this.constructor = constructor;
        this.points = points;
    }

    public String getTeamName() {
        return teamName;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public Constructor getConstructor() {
        return constructor;
    }

    public int getPoints() {
        return points;
    }
}
