
import java.util.Scanner;

public class armstongnumber {

    public static void main(String[] args) {
        try (Scanner ip = new Scanner(System.in)) {
            int num = ip.nextInt(); // Example number
            int num2 = num;
            int res = 0;
            int digits = String.valueOf(num).length();
            while (num != 0) {
                int digit = num % 10;
                res += Math.pow(digit, digits);
                num /= 10;
            }
            if (res == num2) {
                System.out.println(num2 + " is an Armstrong number.");
            }
            else {
                System.out.println(num2 + " is not an Armstrong number.");
            }
        } // Example number
    }
}
