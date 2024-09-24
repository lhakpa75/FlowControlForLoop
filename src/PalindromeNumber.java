//25.Java program to check number is palindrome or not using for loop.
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int original = number, reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed)
            System.out.println(original + " is a Palindrome number.");
        else
            System.out.println(original + " is not a Palindrome number.");
    }
}
