public class Division {                      // Class to perform integer division using repeated subtraction
    public static void main(String[] args) {        // Main method: entry point of the program
        int dividend = 10;                          // Initialize the dividend (number to be divided)
        int divisor = 5;                            // Initialize the divisor (number to divide by)
        int quotient = 0;                           // Initialize quotient to store the result of division
        
        while (dividend - divisor >= 0) {           // Loop until dividend is less than divisor
            quotient++;                             // Increment quotient for each subtraction
            dividend = dividend - divisor;          // Subtract divisor from dividend
        }
        
        System.out.println(quotient);               // Output the result (quotient) to the console is 2
    }
}