package string.problems;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
        // Test the areAnagrams method with two strings
        String str1 = "army";
        String str2 = "mary";

        boolean result = Anagram.areAnagrams(str1, str2);

        if (result) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");

        }

    }
}
