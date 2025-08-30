import java.util.Scanner;

// LCM_GCD

public class Solution01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int a = sc.nextInt();
        System.out.print("Enter next number: ");
        int b = sc.nextInt();

        int x = a;
        int y = b;

        // Compute GCD using Euclidean algorithm
        while (y != 0) {
           int temp = y;
            y = x % y;
            x = temp;
        }
        int gcd = x;

        // Compute LCM
        int lcm = Math.abs(a * b) / gcd;

        System.out.println("LCM: " + lcm + ", GCD: " + gcd);
        sc.close();
    }
}
