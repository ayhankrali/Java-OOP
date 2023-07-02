package polymorphism.figures;

import polymorphism.figures.Figure;

public class Tetragon implements Figure {
    private int[] sides;
    private String type;

    public Tetragon(int[] sides, String type) {
        this.sides = sides;
        this.type = type;
    }

    @Override
    public void sayType() {
        System.out.println("I'm a " + type + " with perimeter " + calculatePerimeter());
    }

    @Override
    public int calculatePerimeter() {
        int perimeter = 0;
        for (int side : sides) {
            perimeter += side;
        }
        return perimeter;
    }
}
