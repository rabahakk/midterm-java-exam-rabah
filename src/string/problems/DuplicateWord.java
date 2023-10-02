package string.problems;
import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        st = st.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the string into words
        String[] words = st.split(" ");

        // Initialize a HashMap to store word frequencies
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Calculate the total length of words and the total number of words
        int totalLength = 0;
        int totalWords = 0;

        for (String word : words) {
            totalLength += word.length();
            totalWords++;

            if (wordCountMap.containsKey(word)) {
                // Word is a duplicate, increment its count
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                // Word is encountered for the first time
                wordCountMap.put(word, 1);
            }
        }

        // Calculate the average length of words
        double averageLength = (double) totalLength / totalWords;

        // Print duplicate words and their counts
        System.out.println("Duplicate Words and Their Occurrences:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }

        // Print the average length of words
        System.out.println("Average Word Length: " + averageLength);
    }

}


