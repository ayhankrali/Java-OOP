package abstraction.country;

import java.util.ArrayList;
import java.util.List;

public class World extends Country{
    private List<Country> countries;

    public World() {
        super();
        countries = new ArrayList<>();
    }

    @Override
    public String getOfficialLanguage() {
        return null;
    }

    @Override
    public int getPopulation() {
        return 0;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public void displayCountryDetails() {
        for (Country country : countries) {
            System.out.println("Country: " + country.getName());
            System.out.println("Capital: " + country.getCapital());
            System.out.println("Official Language: " + country.getOfficialLanguage());
            System.out.println("Population: " + country.getPopulation());
            System.out.println();
        }
    }

}
