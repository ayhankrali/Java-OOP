package polymorphism.songsbook;

public class Book implements Work {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void printInfo() {
        System.out.println("The original " + title + " has " + pages + " pages.");
    }

    @Override
    public void updateInfo() {
        pages -= 50;
        System.out.println("Now it has " + pages + " pages.");
    }
}
