package java_Course.session8.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();

        employees.put(101, "Ahmed");
        employees.put(102, "Sayed");

        System.out.println(employees.get(101));

    }
}
