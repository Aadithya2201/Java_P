import java.util.Scanner;

public class uppertri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arr = new int[a][a];

        // Read the matrix
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean isUpperTriangular = true;

        for (int i = 1; i < a; i++) {
            for (int j = 0; j < i; j++) { // only check upper triangle (i < j)
                if (arr[i][j] != 0) {
                    isUpperTriangular = false;
                    break;
                }
            }
            if (!isUpperTriangular) {
                break;
            }
        }

        if (isUpperTriangular) {
            System.out.println("Matrix is Upper triangular.");
        } else {
            System.out.println("Matrix is NOT Upper triangular.");
        }
        sc.close();
    }
}
