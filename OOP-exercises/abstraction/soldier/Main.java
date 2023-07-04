package abstraction.soldier;

public class Main {
    public static void main(String[] args) {
        MilitaryUnit militaryUnit = new MilitaryUnit();

        InfantrySoldier infantrySoldier = new InfantrySoldier("John Doe", 25, "Private", "Assault Rifle");
        Pilots pilot = new Pilots("Jane Smith", 32, "Captain", "Fighter Jet");

        militaryUnit.addSoldier(infantrySoldier);
        militaryUnit.addSoldier(pilot);

        militaryUnit.displaySoldierDetails();

    }
}
