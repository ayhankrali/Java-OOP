package encapsulation.developercompany;

public class Main {
    public static void main(String[] args) {

            Manager manager1 = new Manager("Ivan", 1500, 5);
            Manager manager2 = new Manager("Ivana", 2000, 10);
            Manager manager3 = new Manager("Alex", 2500, 15);

            Developer developer1 = new Developer("Ivo", 1000, new String[]{"Java"});
            Developer developer2 = new Developer("Iva", 1500, new String[]{"Java", "Python"});
            Developer developer3 = new Developer("Georgi", 2000, new String[]{"Java", "Python", "C"});
            Developer developer4 = new Developer("Gergana", 1500, new String[]{"Java", "C"});

            Manager[] managers = {manager1, manager2, manager3};
            Developer[] developers = {developer1, developer2, developer3, developer4};

            Company company = new Company(managers, developers);

            double bonusAmount = 150;

            for (Manager manager : managers) {
                if (manager.getNumberOfSubordinates() >= 10) {
                    manager.increaseSalary(bonusAmount);
                }
            }

            for (Developer developer : developers) {
                if (developer.getLanguages().length >= 2) {
                    developer.increaseSalary(bonusAmount);
                }
            }

            System.out.println("Spent money: " + company.getTotalSpent());
            Manager topManager = company.getTopManager();
            System.out.println("The top manager is: " + topManager.getName() + ". He/She leads " + topManager.getNumberOfSubordinates() + " people.");
            Developer topDeveloper = company.getTopDeveloper();
            System.out.println("The top developer is: " + topDeveloper.getName() + ". He/She knows:");
            for (String language : topDeveloper.getLanguages()) {
                System.out.println(language);
            }
        }
    }

