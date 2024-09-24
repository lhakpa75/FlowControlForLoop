//21.Java program to swap values without using third variable using for loop
import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Before Swap: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}

