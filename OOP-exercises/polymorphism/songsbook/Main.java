package polymorphism.songsbook;

public class Main {
    public static void main(String[] args) {
        Work[] works = new Work[4];
        works[0] = new Song("Vivir Mi Vida", "Marc Anthony", 2);
        works[1] = new Song("Every Breath You Take", "Sting", 3);
        works[2] = new Book("The Kite Runner", "Khaled Hosseini", 350);
        works[3] = new Book("Avalanche", "Blaga Dimitrova", 344);

        for (Work work : works) {
            work.printInfo();
            work.updateInfo();
            System.out.println("------------------");
        }
    }

}
