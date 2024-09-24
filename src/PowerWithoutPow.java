//22.Java program to calculate power of a number without using pow method using for loop
//23.Java program to find power of a number without using pow method using for loop.
import java.util.Scanner;

public class PowerWithoutPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}

