//20.Java program to swap values using third variable using for loop.
import java.util.Scanner;

public class SwapUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before Swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}

