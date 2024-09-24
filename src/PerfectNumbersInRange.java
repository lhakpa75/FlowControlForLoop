//16.Java program to check all Perfect numbers between 1 to n using for loop.
import java.util.Scanner;

public class PerfectNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}

