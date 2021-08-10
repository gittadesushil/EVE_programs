package StaticExercise;

public class DemoProgramTwo {
    //variable OR Field
    static String name = "pankaj";

    public static void main(String[] args) {
        System.out.println(name);
        MethodOne();
    }

    //Non static method
    public static void MethodOne(){
        System.out.println("Method one");
    }
}
// static is keywoard
// static variable or method can be called using class name no need to crate a object
// satic block
// all the static members always load first time in the memory