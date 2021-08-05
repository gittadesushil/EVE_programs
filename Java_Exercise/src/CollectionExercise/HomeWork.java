package CollectionExercise;

import java.util.ArrayList;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("sparrow");
        birds.add("piegon");
        birds.add("crow");

        List<String> cities = new ArrayList<>();
        cities.add("city one");
        cities.add("city two");
        cities.add("city three");
        cities.add("city four");

        cities.addAll(birds);
        System.out.println(cities);

    }
}
