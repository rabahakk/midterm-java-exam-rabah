package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        int rows = 6; // Number of rows in the pyramid

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Inner loop for printing stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }

        }
  }
