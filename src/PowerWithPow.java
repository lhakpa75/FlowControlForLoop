//24.Java program to calculate power of a number using pow method using for loop.
import java.util.Scanner;

public class PowerWithPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        double result = Math.pow(base, exponent);

        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }
}

