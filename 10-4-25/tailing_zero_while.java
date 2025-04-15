import java.util.Scanner;

public class tailing_zero_while {

    public static void main(String[] args) {
        int count = 0;
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = ip.nextInt();
        
        int temp = n;
        while (temp >= 5) {
            temp = temp / 5;
            count += temp;
        }

        System.out.println("Trailing zeros in factorial: " + count);
        ip.close();
    }
}
