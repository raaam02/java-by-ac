import java.util.Scanner;

public class AvgOfNum {
    public static void main(String[] args) {
        System.out.println("Enter Number to get average of number");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Num: ");
        int num1 = sc.nextInt();

        System.out.print("\nEnter 2nd Num: ");
        int num2 = sc.nextInt();
        
        System.out.print("\nEnter 3rd Num: ");
        int num3 = sc.nextInt();

        sc.close();

        System.out.println("Average of your Numbers are: " + ( (num1 + num2 + num3) / 3 ));
    }
}