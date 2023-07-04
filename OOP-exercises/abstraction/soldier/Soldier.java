package abstraction.soldier;

public abstract class Soldier  {

    private String name;
    private int age;
    private String rank;

    public Soldier(String name, int age, String rank) {
        this.name = name;
        this.age = age;
        this.rank = rank;
    }

    public Soldier() {

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRank() {
        return rank;
    }


    public abstract void performDuty();

}
