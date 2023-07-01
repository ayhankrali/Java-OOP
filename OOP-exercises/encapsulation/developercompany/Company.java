package encapsulation.developercompany;

public class Company {

    private Manager[] managers;
    private Developer[] developers;

    public Company(Manager[] managers, Developer[] developers) {
        this.managers = managers;
        this.developers = developers;
    }

    public double getTotalSpent() {
        double total = 0;
        for (Manager manager : managers) {
            total += manager.getSalary();
        }
        for (Developer developer : developers) {
            total += developer.getSalary();
        }
        return total;
    }

    public Manager getTopManager() {
        Manager topManager = null;
        int maxSubordinates = 0;
        for (Manager manager : managers) {
            if (manager.getNumberOfSubordinates() > maxSubordinates) {
                topManager = manager;
                maxSubordinates = manager.getNumberOfSubordinates();
            }
        }
        return topManager;
    }

    public Developer getTopDeveloper() {
        Developer topDeveloper = null;
        int maxLanguages = 0;
        for (Developer developer : developers) {
            if (developer.getLanguages().length > maxLanguages) {
                topDeveloper = developer;
                maxLanguages = developer.getLanguages().length;
            }
        }
        return topDeveloper;
    }


}



