// To find Armstrong Number between two given number.

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        int low = sc.nextInt();
        System.out.print("Enter 2nd number = ");
        int high = sc.nextInt();

        for (int i=low; i<=high; i++) {
            int num = i;
            int count = 0;
            while (num != 0) {
                count++;
                num /= 10;
            }
            num = i;
            int arm = 0;
            while (num != 0) {
                int currDig = num % 10;
                arm += Math.pow(currDig, count);
                num /= 10;
            }
            if (arm == i)
                System.out.println(arm + " is an armstrong number");
        }
    }
}