package datastructure;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		// Create an ArrayList to store data
		List<String> arrayList = new ArrayList<String>();

		// Add elements to the ArrayList
		arrayList.add("NYC");
		arrayList.add("LA");
		arrayList.add("Denver");
		arrayList.add("Boston");
		arrayList.add("San Jose");
		arrayList.add("Seattle");

		// Print the ArrayList using for-each loop
		System.out.println("Using for-each loop:");
		for (String city : arrayList) {
			System.out.println(city);
		}

		// Remove an element from the ArrayList
		arrayList.remove("Denver");

		// Print the modified ArrayList using Iterator
		System.out.println("\nUsing Iterator:");
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Sort the ArrayList
		Collections.sort(arrayList);

		// Print the sorted ArrayList
		System.out.println("\nSorted ArrayList:");
		for (String city : arrayList) {
			System.out.println(city);
		}
	

	}

}
