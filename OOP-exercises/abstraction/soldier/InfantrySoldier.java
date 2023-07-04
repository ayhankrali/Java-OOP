package abstraction.soldier;

public class InfantrySoldier extends Soldier {
    private String weaponType;

    public InfantrySoldier(String name, int age, String rank, String weaponType) {
        super(name, age, rank);
        this.weaponType = weaponType;
    }

    @Override
    public void performDuty() {
        System.out.println("Infantry soldier is securing the area.");
    }

    public String getWeaponType() {
        return weaponType;
    }
}
