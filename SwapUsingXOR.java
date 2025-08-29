import java.util.Scanner;

public class SwapUsingXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();
        sc.close();

        System.out.println("\nBefore swap: a = " + a + ", b = " + b);

        // Step 1
        a = a ^ b;
        System.out.println("After Step 1 (a = a ^ b): a = " + a + ", b = " + b);

        // Step 2
        b = a ^ b;
        System.out.println("After Step 2 (b = a ^ b): a = " + a + ", b = " + b);

        // Step 3
        a = a ^ b;
        System.out.println("After Step 3 (a = a ^ b): a = " + a + ", b = " + b);

        System.out.println("\nAfter swap: a = " + a + ", b = " + b);
    }
}
