package CollectionExercise;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("kiwi");
        fruits.add("orange");
        fruits.add("strawaberry");


        System.out.println(fruits);

        List<Integer> numbers = new ArrayList();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        numbers.add(12);

        List<Character> chars = new ArrayList();
        chars.add('a');
        chars.add('b');
        chars.add('c');

        List<Boolean> bools = new ArrayList();
        bools.add(true);
        bools.add(false);

        List<Float> floats = new ArrayList<>();
        floats.add(1.0f);
        floats.add(2.0f);
        floats.add(1.1f);
        floats.add(1.3f);
        floats.add(1.2f);

        List<Animal> animals = new ArrayList<>();

        String s = "pankaj";

        Animal a1 = new Animal();
        a1.height = 10;
        a1.weight = 5;
        a1.name = "dog";


        Animal a2 = new Animal();
        a2.height = 20;
        a2.weight = 50;
        a2.name = "cat";

        animals.add(a1);
        animals.add(a2);


//        for (Animal a:animals) {
//            System.out.println("Name of animal : "+a.name + " Weight of animal : "+a.weight + " Height of the animal "+a.height);
//        }


//        int size = fruits.size();
//        System.out.println(size);

//        String fruitName = fruits.get(5);
//        System.out.println(fruitName);

//        for (String fruit:fruits) {
//            System.out.println(fruit);
//        }

//        for(int i=0;i<fruits.size();i++){
//            System.out.println(fruits.get(i));
//        }

        //System.out.println(fruits);

//        String temp = fruits.set(1,"Apple");
//        System.out.println(temp);
//        System.out.println(fruits);

//        boolean temp = fruits.remove("banana");
//        System.out.println(fruits);

//        String temp = fruits.remove(4);
//        System.out.println(temp);
//        System.out.println(fruits);

//        boolean temp = fruits.removeAll(fruits);
//        System.out.println(temp);
//        System.out.println(fruits);

//        fruits.clear();
//        System.out.println(fruits);

        //list into the array
//        Object[] obj =fruits.toArray();
//        for(Object ss :obj){
//            System.out.println(ss);
//        }

        boolean temp = fruits.contains("appledfsdfjsldfjierjer");
        System.out.println(temp);

    }
}
