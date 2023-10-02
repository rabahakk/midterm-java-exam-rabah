package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s="Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);
        //implement
        System.out.println(wordNLength);


    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        //implement
        String[] words = wordGiven.split(" ");
        int maxLength = 0;
        String longestWord = "";
        for (String word : words) {
            // Remove punctuation if necessary (optional)
            word = word.replaceAll("[^a-zA-Z]", "");

            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
                longestWord = word;
            }
        }

        map.put(maxLength, longestWord);


        return map;
    }

}
