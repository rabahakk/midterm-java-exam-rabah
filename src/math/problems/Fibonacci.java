package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int n = 40;
        long[] fibonacciNumbers = new long[n];

        // Initialize the first two Fibonacci numbers
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        // Calculate the Fibonacci numbers from the 3rd to the 40th
        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }

        // Print the first 40 Fibonacci numbers
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumbers[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
    }

}

