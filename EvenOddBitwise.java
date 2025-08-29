import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        sc.close();

        if ((num & 1) == 0) {
            System.out.println(num + " is EVEN.");
        } else {
            System.out.println(num + " is ODD.");
        }
    }
}
