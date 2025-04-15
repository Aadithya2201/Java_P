import java.util.Scanner;
public class calc {
    Scanner ip=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int c = 0; // Initialize c
        while (c != 5) {
            System.out.println("Enter two numbers:");
            int a = ip.nextInt();
            int b = ip.nextInt();
            System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division, 5 to exit:");
            c = ip.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Addition: " + (a + b));
                    break;
                case 2:
                    System.out.println("Subtraction: " + (a - b));
                    break;
                case 3:
                    System.out.println("Multiplication: " + (a * b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Cannot divide by zero");
                    } else {
                        System.out.println("Division: " + (a / b));
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        ip.close();
    }

    
}
