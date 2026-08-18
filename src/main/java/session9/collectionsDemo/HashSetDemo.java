package session9.collectionsDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        // Declare a HashSet
        Set<String> set = new HashSet<>();

        // Method to add elements to the HashSet
        set.add("Mohamed");
        set.add("Ahmed");
        set.add("Ahmed"); // Duplicate, will not be added
        set.add("Sayed");
        set.add("Mahmoud");
        set.add("Omar");

        // Print the HashSet
        System.out.println("HashSet: " + set);

        // Method to check if an element exists in the HashSet
        boolean containsAhmed = set.contains("Ahmed");
        System.out.println("Contains Ahmed: " + containsAhmed);

        // Method to remove an element from the HashSet
        set.remove("Ahmed");
        System.out.println("HashSet after removal: " + set);

        // Method to get the size of the HashSet
        int size = set.size();
        System.out.println("Size of HashSet: " + size);

        // Method to iterate through the HashSet
        System.out.println("Iterating through HashSet:");
        for (String name : set) {
            System.out.println("Name: " + name);
        }

        // Clear the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);



    }
}
