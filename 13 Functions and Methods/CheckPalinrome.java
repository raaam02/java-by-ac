import java.util.Scanner;

public class CheckPalinrome {

    // 121 is a palindrome, 321 is not.
    // If reverse of a number is same than a number is called as palindrome.

    public static boolean isPalindrome(int num) {
        int myNum = num;
        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        if (myNum == rev) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter number to check Palindrome");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.println("Is " + num + " Palindrome? " + isPalindrome(num));
    }
}
