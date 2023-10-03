package datastructure;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<>();
		// Adding elements to the Queue


		// Adding elements to the Queue
		queue.add("First");
		queue.add("Second");
		queue.add("Third");

		// Peeking at the front element without removing it
		String peekedElement = queue.peek();
		System.out.println("Peeked Element: " + peekedElement);

		// Removing and returning the front element
		String removedElement = queue.remove();
		System.out.println("Removed Element: " + removedElement);

		// Polling (removing and returning) the front element
		String polledElement = queue.poll();
		System.out.println("Polled Element: " + polledElement);

		// Using a for-each loop to retrieve and print elements
		System.out.println("Elements in the Queue using for-each loop:");
		for (String element : queue) {
			System.out.println(element);
		}

		// Adding more elements to the Queue
		queue.add("Fourth");
		queue.add("Fifth");

		// Using a while loop with Iterator to retrieve and print elements
		System.out.println("Elements in the Queue using while loop with Iterator:");
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
	}



}
