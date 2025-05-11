
public class squareroot {

    public static void main(String[] args) {
        int number = 3000;
        float sqrt = 0;
        int i = 1;
        while (i < number) {
            if (i * i * i == number) {
                sqrt = i;
                break;
            } else {
                i++;
            }
        }
        System.err.println(sqrt);
    }

}
