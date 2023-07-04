package abstraction.country;

public class UnitedStates extends Country{
    private String president;

    public UnitedStates(String capital, String president) {
        super("United States", capital);
        this.president = president;
    }

    @Override
    public String getOfficialLanguage() {
        return "English";
    }

    @Override
    public int getPopulation() {
        return 331000000; // Example population value
    }

    public String getPresident() {
        return president;
    }
}
