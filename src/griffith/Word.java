package griffith;

public class Word {
    private char[] letters;

    public Word(char[] letters) {
        this.letters = (letters != null) ? letters : new char[]{};
    }

    public boolean contains(char symbol) {
        for (char c : letters) {
            if (c == symbol) return true;
        }
        return false;
    }

    public int length() {
        return letters.length;
    }

    public char[] getLetters() {
        return letters;
    }
}
