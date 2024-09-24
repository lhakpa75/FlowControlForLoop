//36.Write a Java program to find all prime factors of a number using for loop.
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Prime factors of " + number + " are:");
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.println(i);
                number /= i;
            }
        }
    }
}

