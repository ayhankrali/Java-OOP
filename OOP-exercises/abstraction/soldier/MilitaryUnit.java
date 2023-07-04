package abstraction.soldier;

import java.util.ArrayList;
import java.util.List;

public class MilitaryUnit extends Soldier{
    private List<Soldier> soldiers;

    public MilitaryUnit() {
        super();
        soldiers = new ArrayList<>();
    }

    @Override
    public void performDuty() {

    }

    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    public void displaySoldierDetails() {
        for (Soldier soldier : soldiers) {
            System.out.println("Name: " + soldier.getName());
            System.out.println("Age: " + soldier.getAge());
            System.out.println("Rank: " + soldier.getRank());
            soldier.performDuty();
            System.out.println();
        }
    }
}
