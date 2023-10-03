package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {



	public static void main(String[] args) {
        /*
         * Use API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use any databases[MySql] to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
        String line = null;
        try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {
            while ((line = br.readLine()) != null) {
                // Process each line of text here
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        LinkedList<String> linkedList = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        String[] words = line.split("\\s+"); // Split by whitespace
        for (String word : words) {
            linkedList.add(word); // Add to LinkedList (FIFO)
            stack.push(word);     // Push to Stack (FILO)
        }
		String topElement = stack.peek();
		System.out.println("Top element of Stack: " + topElement);
		String poppedElement = stack.pop();
		System.out.println("Popped element from Stack: " + poppedElement);
		for (String word : linkedList) {
			System.out.println("Element from LinkedList (FIFO): " + word);
		}






	}

}
