import java.util.Scanner;

public class BitwiseOperationsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        sc.close();

        System.out.println("\nBitwise Operations:");
        System.out.println("a: " + a + " => " + Integer.toBinaryString(a));
        System.out.println("b: " + b + " => " + Integer.toBinaryString(b));

        System.out.println("\nAND (a & b): " + Integer.toBinaryString(a & b));
        System.out.println("OR (a | b): " + Integer.toBinaryString(a | b));
        System.out.println("XOR (a ^ b): " + Integer.toBinaryString(a ^ b));
        System.out.println("NOT (~a): " + Integer.toBinaryString(~a));
        System.out.println("NOT (~b): " + Integer.toBinaryString(~b));
        System.out.println("a << 1 (Left Shift): " + Integer.toBinaryString(a << 1));
        System.out.println("b >> 1 (Right Shift): " + Integer.toBinaryString(b >> 1));
    }
}
