//12.Java program to find sum of all prime numbers between 1 to n using
//for loop.
import java.util.Scanner;

public class SumOfPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Sum of prime numbers up to " + n + " is: " + sum);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
