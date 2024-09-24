//29.Write a program in Java to print ASCII character with values using for loop.
public class AsciiValues {
    public static void main(String[] args) {
        for (int i = 0; i <= 127; i++) {
            System.out.println("ASCII value of character " + (char)i + " is: " + i);
        }
    }
}

