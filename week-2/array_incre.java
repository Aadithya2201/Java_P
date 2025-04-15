import java.util.Scanner;

public class array_incre {

    public static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] >= a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = ip.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        if (isSorted(arr)) {
            System.out.println("The array is increasing.");
        } else {
            System.out.println("The array is NOT increasing.");
        }
    }
}
