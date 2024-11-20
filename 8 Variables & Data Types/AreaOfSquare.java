import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        System.out.print("Enter the lenth to get area of Square: ");

        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        sc.close();

        System.out.println("\nArea of given Square is: " + length * length);
    }
}
