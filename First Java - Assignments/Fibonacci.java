import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Limit = ");
        int limit = sc.nextInt();
        if (limit <= 0) {
            System.out.print("EMPTY!");
            return;
        } else if (limit == 1) {
            System.out.print(0);
            return;
        }
        int n1 = 0, n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for (int i=2; i<limit; i++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n2);
        }
    }
}