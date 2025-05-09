import java.util.Scanner;

public class lowertri {
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

        boolean isLowerTriangular = true;

        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) { // only check upper triangle (i < j)
                if (arr[i][j] != 0) {
                    isLowerTriangular = false;
                    break;
                }
            }
            if (!isLowerTriangular) {
                break;
            }
        }

        if (isLowerTriangular) {
            System.out.println("Matrix is lower triangular.");
        } else {
            System.out.println("Matrix is NOT lower triangular.");
        }
        sc.close();
    }
}
