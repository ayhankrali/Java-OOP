package abstraction.country;

public class Main {
    public static void main(String[] args) {
        World world = new World();

        UnitedStates usa = new UnitedStates("Washington, D.C.", "Joe Biden");
        Japan japan = new Japan("Tokyo", "Naruhito");

        world.addCountry(usa);
        world.addCountry(japan);

        world.displayCountryDetails();
    }

}
