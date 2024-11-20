import java.util.Scanner;

public class UsersBill {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost of Pencil: ");
        float pencil = sc.nextFloat();

        System.out.print("\nEnter the cost of Pen: ");
        float pen = sc.nextFloat();

        System.out.print("\nEnter the cost of Eraser: ");
        float eraser = sc.nextFloat();

        sc.close();

        float totalAmount = pencil + pen + eraser;
        float gst = totalAmount * 18 / 100;
        float userBill = totalAmount + gst;
        
        System.out.println("\nYour Bill with 18% of GST: " + userBill);
    }
}
