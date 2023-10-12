// Fibonacci series upto a certain number

import java.util.Scanner;

public class Fibonacci_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit = ");
        int limit = sc.nextInt();
        System.out.println("Fibonacci series upto " +limit+ "...");
        if (limit == 0) {
            System.out.print(0);
            return;
        } else if (limit < 0) {
            System.out.print("EMPTY!");
            return;
        }
        int n1 = 0, n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        int n3 = 1;
        while (n3 <= limit) {
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }
}