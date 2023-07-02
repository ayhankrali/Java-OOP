package polymorphism.stringmanipulator;

public class StringManipulator {
    private String input;

    public StringManipulator(String input) {
        this.input = input;
    }

    public String toLowerCase() {
        return input.toLowerCase();
    }

    public String toUpperCase() {
        return input.toUpperCase();
    }

    public String capitalize() {
        String firstLetter = input.substring(0, 1).toUpperCase();
        String restOfWord = input.substring(1).toLowerCase();
        return firstLetter + restOfWord;
    }

    public String separateLetters() {
        String separated = String.join(" ", input.split(""));
        return separated;
    }

    public void printLetterAtPosition(int position) {
        if (position >= 0 && position < input.length()) {
            char letter = input.charAt(position);
            System.out.println("Letter at position " + position + " is " + letter);
        } else {
            System.out.println("Invalid position");
        }
}

}
