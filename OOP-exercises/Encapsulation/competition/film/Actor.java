package Encapsulation.competition.film;

import java.util.List;

public class Actor {
    private String name;
    private List<String> awardWinningRoles;
    private List<String> movies;

    public Actor(String name, List<String> awardWinningRoles, List<String> movies) {
        this.name = name;
        this.awardWinningRoles = awardWinningRoles;
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public List<String> getAwardWinningRoles() {
        return awardWinningRoles;
    }

    public List<String> getMovies() {
        return movies;
    }
}
