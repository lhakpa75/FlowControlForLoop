//18.Java program to print all Strong numbers between 1 to n using for loop.
import java.util.Scanner;

public class StrongNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isStrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isStrong(int number) {
        int original = number, sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        return sum == original;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
