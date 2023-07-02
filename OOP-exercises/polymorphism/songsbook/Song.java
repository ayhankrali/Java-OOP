package polymorphism.songsbook;

public class Song implements Work {
    private String title;
    private String author;
    private int duration;

    public Song(String title, String author, int duration) {
        this.title = title;
        this.author = author;
        this.duration = duration;
    }

    @Override
    public void printInfo() {
        System.out.println("The original " + title + " is " + duration + " minutes long.");

    }

    @Override
    public void updateInfo() {
        duration++;
        System.out.println("Now it is " + duration + " minutes long.");

    }
}
