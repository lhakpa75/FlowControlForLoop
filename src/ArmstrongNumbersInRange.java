//14.Java program to print all Armstrong numbers between 1 to n using for loop.
import java.util.Scanner;

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int original = number, sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        return sum == original;
    }
}

