public class sieve {
    public static void main(String[] args) {
        int input = 10;
        int iterations = 0;

        boolean[] primesArray = new boolean[input];
        for (int i = 0; i < primesArray.length; i++) {
            primesArray[i] = true;
        }

        for (int i = 2; i * i< primesArray.length; i++) {
            if (primesArray[i]) {
                for (int j = i * i; j < primesArray.length; j = j + i) {
                    primesArray[j] = false;
                    iterations++;
                }
            }
        }

        for (int i = 0; i < primesArray.length; i++) {
            if (primesArray[i]) {
                System.out.println(i);
            }
        }
        System.out.println("Iterations: " + iterations);
    }
}