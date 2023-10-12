import java.util.Scanner;

public class Fibonacci_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n-th term = ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.print("EMPTY!");
            return;
        } else if (n == 1) {
            System.out.print("The Fibonacci number is " + 0);
            return;
        } else if (n == 2) {
            System.out.print("The Fibonacci number is " + 1);
            return;
        }

        int n1 = 0, n2 = 1;
        int n3 = 0;
        for (int i=3; i<=n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.print("The Fibonacci number is " + n3);
    }
}