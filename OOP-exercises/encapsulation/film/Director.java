package encapsulation.film;

import java.util.List;

public class Director {
    private String name;
    private List<String> directedMovies;
    private List<String> awardWinningMovies;

    public Director(String name, List<String> directedMovies, List<String> awardWinningMovies) {
        this.name = name;
        this.directedMovies = directedMovies;
        this.awardWinningMovies = awardWinningMovies;
    }

    public String getName() {
        return name;
    }

    public List<String> getDirectedMovies() {
        return directedMovies;
    }

    public List<String> getAwardWinningMovies() {
        return awardWinningMovies;
    }
}
