package abstraction.country;

public abstract class Country  {

    private String name;
    private String capital;

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public Country() {

    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }


    public abstract String getOfficialLanguage();


    public abstract int getPopulation();
}
