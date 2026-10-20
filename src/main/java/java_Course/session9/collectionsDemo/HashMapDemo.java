package java_Course.session9.collectionsDemo;
import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {
    public static void main(String[] args) {

        // Declare a HashMap
        Map< Integer, String> map = new HashMap<>();

        // Method to add elements to the HashMap
        map.put(101, "Mohamed");
        map.put(102, "Ahmed");
        map.put(103, "Sayed");
        map.put(104, "Mahmoud");
        map.put(105, "Omar");

        // Print the HashMap
        System.out.println("HashMap: " + map);

        // Method to access elements from the HashMap
        String name101 = map.get(101);
        System.out.println("Name with key 101: " + name101);
        System.out.println("Name with key 102: " + map.get(102));
        System.out.println("Name with key 106: " + map.get(106)); // Non-existing key

        // Method to remove an element from the HashMap
        map.remove(104);
        System.out.println("HashMap after removal: " + map);

        // Method to update an element in the HashMap
        map.put(103, "Ali");
        System.out.println("HashMap after update: " + map);

        // Method to get the size of the HashMap
        int size = map.size();
        System.out.println("Size of HashMap: " + size);

        //TODO
        // Method to iterate through the HashMap
        System.out.println("Iterating through HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        // Clear the HashMap
        map.clear();
        System.out.println("HashMap after clearing: " + map);

        // Access element by value
//        System.out.println("Contains value 'Omar': " + map.containsValue("Omar"));

        //TODO
        // Get the key of value
        System.out.println();

    }
}
