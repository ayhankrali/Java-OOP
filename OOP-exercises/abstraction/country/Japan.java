package abstraction.country;

public class Japan extends Country{
    private String emperor;

    public Japan(String capital, String emperor) {
        super("Japan", capital);
        this.emperor = emperor;
    }

    @Override
    public String getOfficialLanguage() {
        return "Japanese";
    }

    @Override
    public int getPopulation() {
        return 126000000; // Example population value
    }

    public String getEmperor() {
        return emperor;
    }
}
