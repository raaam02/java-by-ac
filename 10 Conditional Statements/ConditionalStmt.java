import java.util.Scanner;

public class ConditionalStmt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Write a Java program to get a number from the user and print whether it is positive or negative
        System.out.print("Enter a number to check +ve or -ve: ");
        int num = sc.nextInt();
        System.out.println("\n" + num + " is: " + (num == 0 ? "Neither +ve nor -ve" : num > 0 ? "+ve" : "-ve" ));

        // 2. You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
        System.out.print("\nEnter a temprature to check you have fever or not: ");
        int temp = sc.nextInt();
        System.out.println("\n" + (temp > 100 ? "You have a fever" : "You don't have fever"));

        // 3. Write a Java program to input week number (1-7) and print day of week name using switch case.
        System.out.print("\nEnter a day number to check the Day: ");
        int day = sc.nextInt();
        switch (day) {
            case 1: System.out.println("It's Monday");
                break;
            case 2: System.out.println("It's Tuesday");
                break;
            case 3: System.out.println("It's Wednesday");
                break;
            case 4: System.out.println("It's Thursday");
                break;
            case 5: System.out.println("It's Friday");
                break;
            case 6: System.out.println("It's Saturday");
                break;
            case 7: System.out.println("It's Sunday");
                break;
            default: System.out.println("Only select between 1-7");
                break;
        }

        //Write a Java program that takes a year from the user and print whether that year is a leap year or not.
        System.out.print("\nEnter a Year to check weather it is Leap Year or not: ");
        int year = sc.nextInt();
        if (year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0) )) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is 'Not' a Leap year");
        }

        sc.close();
    }
}
