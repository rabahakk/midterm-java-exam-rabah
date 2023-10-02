package math.problems;

public class Factorial {
    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    // Iterative method to calculate factorial
    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int num = 5; // Change this to the desired number for which you want to find the factorial.

        // Calculate factorial using recursion
        int recursiveResult = factorialRecursive(num);
        System.out.println("Factorial (Recursive) of " + num + " is: " + recursiveResult);

        // Calculate factorial using iteration
        int iterativeResult = factorialIterative(num);
        System.out.println("Factorial (Iterative) of " + num + " is: " + iterativeResult);
    }


}

