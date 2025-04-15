
import java.util.Scanner;

public class tailing_zero {

    public static void main(String[] args) {
        try (Scanner ip = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = ip.nextInt();
            int count = 0;
            int a = 0;
            for (int i = 5; n / i >= 1; i *= 5) {
                count += n / i;
                a++;
            }
            System.out.println("Number of trailing zeros in " + n + "! is: " + count);
            System.out.println(a);
        }
    }
}

