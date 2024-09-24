//19.Write a program in Java to swap first and last digit of number using for loop.
import java.util.Scanner;

public class SwapFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int lastDigit = number % 10;
        int firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));

        String swapped = lastDigit + Integer.toString(number).substring(1, Integer.toString(number).length() - 1) + firstDigit;

        System.out.println("Number after swapping first and last digit: " + swapped);
    }
}
