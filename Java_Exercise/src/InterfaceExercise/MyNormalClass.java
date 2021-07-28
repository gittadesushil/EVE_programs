package InterfaceExercise;

public class MyNormalClass implements Demo {
    public void MethodOne(){
        System.out.println("from method one");
    }

    public void MethodTwo(){
        System.out.println("from method two");
    }

    public int MethodThree(){
        System.out.println("from method three");
        return 0;
    }
    public char[] MethodFour(String param1, String param2, int param3){
        System.out.println("from method four");
        char[] ch = {};
        return ch;
    }
}
