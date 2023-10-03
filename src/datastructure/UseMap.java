package datastructure;
import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MySql] to store data and retrieve data.
		 */
		Map<String, List<String>> cityMap = new HashMap<>();

		// Add cities to the map
		List<String> citiesInUSA = new ArrayList<>();
		citiesInUSA.add("NYC");
		citiesInUSA.add("LA");
		citiesInUSA.add("Denver");

		List<String> citiesInCanada = new ArrayList<>();
		citiesInCanada.add("Toronto");
		citiesInCanada.add("Vancouver");
		citiesInCanada.add("Montreal");

		cityMap.put("USA", citiesInUSA);
		cityMap.put("Canada", citiesInCanada);

		// Retrieve and print cities using for-each loop
		System.out.println("Cities in USA:");
		List<String> usaCities = cityMap.get("USA");
		for (String city : usaCities) {
			System.out.println(city);
		}

		// Retrieve and print cities using Iterator
		System.out.println("\nCities in Canada:");
		List<String> canadaCities = cityMap.get("Canada");
		Iterator<String> iterator = canadaCities.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Now, you can interact with a database like MySQL to store and retrieve data.
		// You would typically use a database connection library (e.g., JDBC) to do this.
		// Here's a simplified example without database connection:
		System.out.println("\nStoring and retrieving data from a MySQL database (simplified):");
		// Assume you have a MySQL database connection

		// Storing data in the database
		storeDataInDatabase(cityMap);

		// Retrieving data from the database
		Map<String, List<String>> retrievedData = retrieveDataFromDatabase();

		// Print retrieved data
		for (Map.Entry<String, List<String>> entry : retrievedData.entrySet()) {
			System.out.println("Country: " + entry.getKey());
			System.out.println("Cities: " + entry.getValue());
		}
	}

	// Simulated database functions (same as in the previous example)
	private static void storeDataInDatabase(Map<String, List<String>> data) {
		// Simulate storing data in a MySQL database
		System.out.println("Data stored in the database: " + data);
	}

	private static Map<String, List<String>> retrieveDataFromDatabase() {
		// Simulate retrieving data from a MySQL database
		Map<String, List<String>> sampleData = new HashMap<>();
		List<String> cities = new ArrayList<>();
		cities.add("Sample City 1");
		cities.add("Sample City 2");
		sampleData.put("Sample Country", cities);
		return sampleData;
	}
}




