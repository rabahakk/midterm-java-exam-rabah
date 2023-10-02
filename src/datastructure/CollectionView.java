package datastructure;
import java.util.Collection;
import java.util.HashMap;

public class CollectionView {

        public static void main(String[] args) {
                // Create a HashMap and insert some data
                HashMap<Integer, String> map = new HashMap<Integer, String>();
                map.put(1, "NYC");
                map.put(2, "LA");
                map.put(3, "Denver");
                map.put(4, "Boston");
                map.put(5, "San Jose");
                map.put(6, "Seattle");

                // Retrieve the Collection view of values from the map
                Collection<String> values = map.values();

                // Print the values
                for (String value : values) {
                        System.out.println(value);
                }
        }
}

