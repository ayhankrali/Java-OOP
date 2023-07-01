package Encapsulation.competition;

import jdk.internal.access.JavaSecurityAccess;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create pilots
        Pilot pilot1 = new Pilot("M. Verstapen", 0, 8);
        Pilot pilot2 = new Pilot("L. Norris", 0, 4);
        Pilot pilot3 = new Pilot("F. Alonso", 0, 22);
        Pilot pilot4 = new Pilot("L. Hamilton", 0, 16);
        Pilot pilot5 = new Pilot("C. Sainz", 0, 8);

        // Create constructors
        Constructor constructor1 = new Constructor("Ivan Ivanov", 0, 0);
        Constructor constructor2 = new Constructor("Ivana Ivanova", 0, 0);
        Constructor constructor3 = new Constructor("Georgi Georgiev", 0, 0);
        Constructor constructor4 = new Constructor("Gergana Gerganova", 0, 0);
        Constructor constructor5 = new Constructor("Alex Alex", 0, 0);

        // Create teams
        Team team1 = new Team("Red Bull", pilot1, constructor1, 0);
        Team team2 = new Team("Aston Martin", pilot3, constructor2, 0);
        Team team3 = new Team("Mercedes", pilot4, constructor3, 0);
        Team team4 = new Team("Ferrari", pilot5, constructor4, 0);
        Team team5 = new Team("McLaren", pilot2, constructor5, 0);

        // Create map to track points of each team
        Map<String, Integer> teamPoints = new HashMap<>();

        // Simulate 23 races and update points
        for (int i = 1; i <= 23; i++) {
            // Simulate race and update points
            // (Assuming the race results are provided externally)

            // Update team points based on race results
            updatePoints(team1, 25);
            updatePoints(team2, 18);
            updatePoints(team3, 15);
            updatePoints(team4, 10);
            updatePoints(team5, 8);
        }

        // Find the team with the highest points
        String winnerTeamName = "";
        int maxPoints = 0;

        for (Map.Entry<String, Integer> entry : teamPoints.entrySet()) {
            if (entry.getValue() > maxPoints) {
                winnerTeamName = entry.getKey();
                maxPoints = entry.getValue();
            }
        }

        // Find the pilot with the most wins
        String bestPilotName = "";
        int maxWins = 0;

        if (team1.getPilot().getWins() > maxWins) {
            bestPilotName = team1.getPilot().getName();
            maxWins = team1.getPilot().getWins();
        }

        if (team2.getPilot().getWins() > maxWins) {
            bestPilotName = team2.getPilot().getName();
            maxWins = team2.getPilot().getWins();
        }

        if (team3.getPilot().getWins() > maxWins) {
            bestPilotName = team3.getPilot().getName();
            maxWins = team3.getPilot().getWins();
        }

        if (team4.getPilot().getWins() > maxWins) {
            bestPilotName = team4.getPilot().getName();
            maxWins = team4.getPilot().getWins();
        }

        if (team5.getPilot().getWins() > maxWins) {
            bestPilotName = team5.getPilot().getName();
            maxWins = team5.getPilot().getWins();
        }

        // Find the constructor with the most winning cars
        String bestConstructorName = "";
        int maxWinningCars = 0;

        if (team1.getConstructor().getWinningCars() > maxWinningCars) {
            bestConstructorName = team1.getConstructor().getName();
            maxWinningCars = team1.getConstructor().getWinningCars();
        }

        if (team2.getConstructor().getWinningCars() > maxWinningCars) {
            bestConstructorName = team2.getConstructor().getName();
            maxWinningCars = team2.getConstructor().getWinningCars();
        }

        if (team3.getConstructor().getWinningCars() > maxWinningCars) {
            bestConstructorName = team3.getConstructor().getName();
            maxWinningCars = team3.getConstructor().getWinningCars();
        }

        if (team4.getConstructor().getWinningCars() > maxWinningCars) {
            bestConstructorName = team4.getConstructor().getName();
            maxWinningCars = team4.getConstructor().getWinningCars();
        }

        if (team5.getConstructor().getWinningCars() > maxWinningCars) {
            bestConstructorName = team5.getConstructor().getName();
            maxWinningCars = team5.getConstructor().getWinningCars();
        }

        // Print the results
        System.out.println("The total winner is: " + winnerTeamName + " - " + maxPoints);
        System.out.println("The best pilot is: " + bestPilotName + " - " + maxWins);
        System.out.println("The best constructor is: " + bestConstructorName + " - " + maxWinningCars);
    }

    private static void updatePoints(Team team, int points) {
        int currentPoints = team.getPoints();
        currentPoints += points;
        JavaSecurityAccess.ProtectionDomainCache teamPoints = null;


        // Update pilot wins
        Pilot pilot = team.getPilot();
        int currentWins = pilot.getWins();
        currentWins += points == 25 ? 1 : 0;
        pilot.setWins(currentWins);

        // Update constructor winning cars
        Constructor constructor = team.getConstructor();
        int currentWinningCars = constructor.getWinningCars();
        currentWinningCars += points == 25 ? 1 : 0;
        constructor.setWinningCars(currentWinningCars);
    }
}

