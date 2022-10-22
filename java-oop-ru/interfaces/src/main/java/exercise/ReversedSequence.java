package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {

    String str;

    ReversedSequence(String str) {
        this.str = str;
    }

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int i) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return null;
    }
}
// END
