package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int lowestDifference = Integer.MAX_VALUE; // Initialize with a high value

        // Nested loops to compare elements
        for (int k : array1) {
            for (int j = 0; j < array2.length; j++) {
                int difference = Math.abs(k - array2[j]); // Absolute difference
                if (difference < lowestDifference) {
                    lowestDifference = difference; // Update lowest difference if found
                }
            }
        }

        System.out.println("The lowest difference between cells is: " + lowestDifference);
    }


}


