//15.Java program to check a given number is Perfect or not using for loop
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number)
            System.out.println(number + " is a Perfect number.");
        else
            System.out.println(number + " is not a Perfect number.");
    }
}

