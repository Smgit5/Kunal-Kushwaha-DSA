import java.util.Scanner;

public class CurrencyConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rupee: ");
        double rupee = sc.nextDouble();
        double usd = rupee * 0.012;
        System.out.print("USD = " + usd);
    }
}