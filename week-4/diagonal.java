import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[][] arr = new int[a][a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean isValid = true;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == j) {
                    if (arr[i][j] == 0) {
                        isValid = false;
                        break;
                    }
                } else {
                    if (arr[i][j] != 0) {
                        isValid = false;
                        break;
                    }
                }
            }
            if (!isValid) {
                break;
            }
        }

        if (isValid) {
            System.out.println("Matrix is a diagonal matrix with nonzero diagonal elements.");
        } else {
            System.out.println("Matrix does not meet the diagonal matrix condition.");
        }
        sc.close();
    }
}
