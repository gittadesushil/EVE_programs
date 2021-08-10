package StaticExercise;

public class Person {
     static String name = "pankaj";
     static String address;
     static int age;

     static final String KEY = "PRC";

     static {
          System.out.println("1 block");
     }

     static {
          System.out.println("2 nd block");
     }

}
