package Encapsulation.competition.film;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create director objects
        Director director1 = new Director("Ivan", List.of("Catch me if you can", "The Godfather",
                "An American Hippie in Israel", "Zaat "), List.of("Catch me if you can", "The Godfather"));
        Director director2 = new Director("Ivana", List.of("Titanic"), List.of("Titanic"));
        Director director3 = new Director("Alex", List.of("Caligula"), List.of());
        Director director4 = new Director("Stamat", List.of("One man"), List.of());

        // Create actor objects
        Actor actor1 = new Actor("Georgi", List.of("Frank Abagnale", "Vito Corleone"),
                List.of("Catch me if you can", "The Godfather", "An American Hippie in Israel", "Zaat "));
        Actor actor2 = new Actor("Gergana", List.of("Frank Abagnale", "Vito Corleone", "Jack"),
                List.of("Catch me if you can", "The Godfather", "Titanic"));
        Actor actor3 = new Actor("Toni", List.of(), List.of("An American Hippie in Israel", "Caligula", "Zaat ", "One man"));

        // Create a list of directors and actors
        List<Director> directors = List.of(director1, director2, director3, director4);
        List<Actor> actors = List.of(actor1, actor2, actor3);

        // Print the directors and actors they worked with
        for (Director director : directors) {
            System.out.print("Director " + director.getName() + " has worked with: ");
            List<String> collaboratedActors = new ArrayList<>();
            for (Actor actor : actors) {
                if (actor.getMovies().stream().anyMatch(director.getDirectedMovies()::contains)) {
                    collaboratedActors.add(actor.getName());
                }
            }
            System.out.println(String.join(" ", collaboratedActors));
        }
    }
}