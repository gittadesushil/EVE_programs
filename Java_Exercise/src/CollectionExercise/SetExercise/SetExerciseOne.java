package CollectionExercise.SetExercise;

import java.util.*;

public class SetExerciseOne {
    public static void main(String[] args) {


        //List<String> ref = new ArrayList();

        Set<Character> ref = new HashSet<>();

        ref.add('A');
        ref.add('A');
        ref.add('B');
        ref.add('C');
        ref.add('a');

        //System.out.println(ref);

        //ref.remove('A');

        //ref.clear();

//        System.out.println(ref.size());
//        for (char a:ref) {
//            System.out.println(a);
//        }


//        Object[]  obj = ref.toArray();
//        boolean item = ref.contains('A');
//        System.out.println(item);

        List<String> programmings = new ArrayList<>();
        programmings.add("csharp");
        programmings.add("cpp");
        programmings.add("java");
        programmings.add("java");
        programmings.add("java");
        programmings.add("c");
        programmings.add("python");
        programmings.add("cpp");

        for (String program:programmings) {
            System.out.println(program);
        }

        Set<String> programmingLangSet = new HashSet<>(programmings);
        System.out.println("------Items for Set---------");

        for (String pp:programmingLangSet) {
            System.out.println(pp);
        }

        List<String> listobj = new ArrayList(programmingLangSet);
        listobj.set(3,"Java");
        System.out.println("------Converstion from SET TO list---------");
        for (String pp:listobj) {
            System.out.println(pp);
        }


        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);


    }
}
