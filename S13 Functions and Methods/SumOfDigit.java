import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.print("Enter the number to get sum of Digit: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.println("Sum of " + num + " = " + sumOfDigit(num));
    }
    public static int sumOfDigit(int num){
        int sum = 0;

        while (num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }
        return sum;
    }
}
