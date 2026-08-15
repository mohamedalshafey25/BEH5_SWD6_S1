package session8.collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("Mohamed");
        names.add(0,"Ahmed");
        names.addFirst("Sayed");

        System.out.println(names.get(1));

        names.set(0, "Batta");
        names.remove(0);
        names.remove("Batta");





    }
}
