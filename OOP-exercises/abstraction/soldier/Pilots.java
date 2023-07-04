package abstraction.soldier;

public class Pilots extends Soldier{
    private String aircraftType;

    public Pilots(String name, int age, String rank, String aircraftType) {
        super(name, age, rank);
        this.aircraftType = aircraftType;
    }

    @Override
    public void performDuty() {
        System.out.println("Pilot is flying the aircraft.");
    }

    public String getAircraftType() {
        return aircraftType;
    }
}
