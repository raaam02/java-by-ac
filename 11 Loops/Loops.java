import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // 1. How many times 'Hello' is printed?
        for(int i = 0; i < 5 ; i++) {
            System.out.println("Hello");
            i+=2;
        }

        // 2. Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        int oddSum = 0, evenSum = 0, choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }

            System.out.print("Want to add more? Enter 1 to add more OR 0 to exit: ");
            choice = sc.nextInt();
            
        } while (choice != 0);
        sc.close();
        System.out.println("Sum of Odd = " + oddSum + "\nSum Of Even = " + evenSum);

        // 3. Write a program to find the factorialof any number entered by the user.
        System.out.print("Enter any number to get Factorial: ");
        int num = sc.nextInt();
        System.out.println(num + "! = " + getFactorial(num));

        // 4. Write a program to print the multiplication table of a number N, entered by the user.
        System.out.print("Enter number to get table: ");
        long table = sc.nextLong();
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " * " + i + " = "+ table * i);
        } 
    }

    public static int getFactorial(int num){
        int fact = 1;
        if (num == 0 || num == 1) {
            return 1;
        }
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    };
}