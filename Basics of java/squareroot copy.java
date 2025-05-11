public class squareroot {
    public static void main(String[] args) {
        
        double num = 27;
        int root = 3;  // cube root
        double l = 0;
        double r = num;
        double mid = 0;
        double error = 0.0000001;

        while ((r - l) > error) {
            mid = (l + r) / 2;
            if (multi(mid, root) > num) {
                r = mid;
            } else {
                l = mid;
            }
        }

        System.out.println(root + "th root of " + num + " is: " + mid);
    }

    public static double multi(double num, int root) {
        double result = 1.0;
        for (int i = 0; i < root; i++) {
            result *= num;
        }
        return result;
    }
}
