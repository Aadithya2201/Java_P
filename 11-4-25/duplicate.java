public class duplicate {

    public static void main(String[] args) {
        int num[] = {4, 5, 9, 10};
        int a=num.length;
        int flag=0;
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (num[i] == num[j]) {
                    flag = 1;
                    System.out.println("Duplicate number is: " + num[i]);
                }
            }
            
        }
        if (flag == 0) {
            System.out.println("No duplicate number found.");
        }
    }
}


