package ReturnTypeExercise;

public class ReturnTypeDemoTwoExecutor {
    public static void main(String[] args) {
        ReturnTypeDemoTwo obj1 = new ReturnTypeDemoTwo();

        PersonOne p = new PersonOne();
        String name = "pankaj";

        obj1.MethodOne( p);
        obj1.MethodTwo(name);
    }
}
