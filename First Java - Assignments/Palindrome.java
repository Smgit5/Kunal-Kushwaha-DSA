// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        String newStr = "";
        for (int i=str.length()-1; i>=0; i--) {
            newStr += str.charAt(i);
        }
        if (str.equals(newStr))
            System.out.println("Yes - Palindrome");
        else
            System.out.println("Not - Palindrome");
    }
}