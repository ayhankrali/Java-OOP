package Encapsulation.competition.figure;

public class Box {
    private int height;
    private int width;
    private int length;

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public boolean isCube() {
        return height == width && width == length;
    }

    public boolean isValid() {
        return height > 0 && width > 0 && length > 0;
    }

    public int calculateSurfaceArea() {
        return 2 * (height * width + width * length + height * length);
    }

    public void printBox() {
        if (!isValid()) {
            System.out.println("Invalid properties");
        } else {
            if (isCube()) {
                System.out.println("This box is a cube and has surface area = " + calculateSurfaceArea());
            } else {
                System.out.println("This box is a parallelepiped and has surface area = " + calculateSurfaceArea());
            }
        }
    }
}
