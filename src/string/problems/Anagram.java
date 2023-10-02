package string.problems;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String str1 = "CAT";
        String str2 = "ACT";

        boolean areAnagrams = areAnagrams(str1, str2);

        if (areAnagrams) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create character frequency maps for both strings
        Map<Character, Integer> frequencyMap1 = new HashMap<>();
        Map<Character, Integer> frequencyMap2 = new HashMap<>();

        // Populate the frequency maps for str1
        for (char c : str1.toCharArray()) {
            frequencyMap1.put(c, frequencyMap1.getOrDefault(c, 0) + 1);
        }

        // Populate the frequency maps for str2 and compare
        for (char c : str2.toCharArray()) {
            frequencyMap2.put(c, frequencyMap2.getOrDefault(c, 0) + 1);
        }

        return frequencyMap1.equals(frequencyMap2);
    }
}

