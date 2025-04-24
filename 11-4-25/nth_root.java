public class nth_root {
    public static void main(String[] args) {
        double num = 28;
        double root = 3;
        double left = 0;
        double right = num;
        double middle = 0;
        double error = 0.00000001;

        while ((right - left) > error) {
            middle = (left + right) / 2;
            if (multiply(middle, root) > num) {
                right = middle;
            } else {
                left = middle;
            }

        }
        System.out.println(middle);
    }

    public static double multiply(double num, double root) {
        double mulvalue = 1;
        for (int i = 0; i < root; i++) {
            mulvalue = mulvalue * num;
        }
        return mulvalue;
    }
}