import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //=================================================================================================================

        System.out.println("1. Java program to print all natural numbers from 1 to n using for loop.");

        //Solution:
        System.out.println("Enter a number n: ");
        int n = scanner.nextInt();
        System.out.print("Natural numbers from 1 to n:\n");
        for (int i = 1; i <= n; i++) {
            System.out.println( i);
        }

        System.out.println("=".repeat(100));
        //=================================================================================================================

        System.out.println("2. Java program to print all even numbers between 1 to 100 using for loop.");

        //Solution:
        int evenNums;
        while (true) {
            System.out.println("Enter a number from 1 - 100: ");
            evenNums = scanner.nextInt();
            if (evenNums >= 1 && evenNums <= 100) {
                break;
            } else {
                System.out.print("The limit cannot exceed 100 or be less than 1. Try again!");
            }
        }
            System.out.print("Even numbers from 1 to " + evenNums + ": \n");
            for (int i = 2; i <= evenNums; i += 2) {
                System.out.println(i);
            }

        System.out.println("=".repeat(100));
        //=================================================================================================================

        System.out.println("3. Java program to print all odd number between 1 to 100 using for loop.");

        //Solution:
        int oddNums;
        while (true) {
            System.out.println("Enter a number from 1 - 100: ");
            oddNums = scanner.nextInt();
            if (oddNums >= 1 && oddNums <= 100) {
                break;
            } else {
                System.out.print("The limit cannot exceed 100 or be less than 1. Try again!");
            }
        }
        System.out.print("Odd numbers from 1 to " + oddNums + ": \n");
        for (int i = 1; i <= oddNums; i += 2) {
            System.out.println(i);
        }

        System.out.println("=".repeat(100));
        //=================================================================================================================

        System.out.println("4. Java program to print sum of all even numbers between 1 to n using for loop.");

        //Solution:
        int sumEven = 0;
        for (int i = 2; i <= n; i += 2) {
            sumEven += i;
        }
        System.out.println("-> The sum of all even numbers between 1 to " + n + "(value of n): " + sumEven);

        System.out.println("=".repeat(100));
        //=================================================================================================================

        System.out.println("5. Java program to print sum of all odd numbers between 1 to n using for loop.");

        //Solution:
        int sumOdd = 0;
        for (int i = 1; i <= n; i += 2) {
            sumOdd += i;
        }
        System.out.println("-> The sum of all odd numbers between 1 to " + n + "(value of n): " + sumOdd);

        System.out.println("=".repeat(100));
        //=================================================================================================================

        System.out.println("6. Java program to print multiplication of any number using for loop.");

        //Solution
        int multiple;
        System.out.println("Enter a number to print multiplication table: ");
        multiple = scanner.nextInt();
        System.out.println("Multiplication table of " + multiple);
        for (int i = 1; i <= 10; i ++ ) {
            System.out.println(multiple + " x " + i + " = " + (i * multiple));
        }

        System.out.println("=".repeat(100));
        //=================================================================================================================

        System.out.println("7. Java program to count the digits of a given number using for loop.");

        //Solution
        System.out.println("Enter a number to count the digits of a given number: ");
        int digit = scanner.nextInt();
        int count = 0;

        for (int temp = digit; temp != 0; temp /= 10) {
            count++;
        } System.out.println("The number of digit in " + digit + " is: " + count );

        System.out.println("=".repeat(100));
        //=================================================================================================================

        System.out.println("8. Java program to print the sum of digits of a given number using for loop.");

        //Solution
        System.out.println("Enter a number to count the digits of a given number: ");
        int digits = scanner.nextInt();
        int sum = 0;

        for (int temp = digits; temp != 0; temp /= 10) {
            int digit2 = temp % 10;
            sum += digit2;
        } System.out.println("The number of digits in " + digits + " is: " + sum);

        System.out.println("=".repeat(100));
        //=================================================================================================================

        System.out.println("9. Java program to print all natural numbers in reverse order using for loop.");

        //Solution:
        System.out.println("Enter a number to count it in reverse order: ");
        int reverse = scanner.nextInt();

        for (int i = reverse; i >= 1; i --) {
            System.out.println(i);
        }
        System.out.println("=".repeat(100));
        //=================================================================================================================

        System.out.println("10. Java program to check whether a given number is Prime or not using for loop.");

        //Solution
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        System.out.println("=".repeat(100));
        //=================================================================================================================

        System.out.println("11. Java program to print all Prime numbers between 1 to x using for loop.");

        //Solution:
        System.out.print("Enter the a value for x: ");
        int x = scanner.nextInt();

        System.out.println("Prime numbers between 1 and " + x + ":");

        for (int num = 2; num <= n; num++) {
            boolean isxPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isxPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }

        System.out.println("=".repeat(100));

    }

}