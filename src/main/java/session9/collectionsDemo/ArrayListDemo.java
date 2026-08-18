package session9.collectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        // add elements
        elements.add("Mohamed");
        System.out.println(elements);

        elements.add("Ahmed");
        elements.add("Saeid");


        // Print elements
        System.out.println(elements);

        // Access elements
        System.out.println(elements.get(1));
        System.out.println("First Element: " + elements.getFirst());

        // remove element
        elements.remove("Ahmed");
        elements.remove(0);
        System.out.println("After removal: " + elements);

        elements.add("Mohamed");
        elements.add("Ahmed");
        System.out.println(elements);


        // Update element
        elements.set(0,"Ali Baba");

        System.out.println(elements);

        // size
        System.out.println("Size: " + elements.size());

        // iterate through all elements

        for (String element : elements){
            System.out.println("Element: " + element);

        }

        // clear
        elements.clear();
        System.out.println(elements);

    }

}
