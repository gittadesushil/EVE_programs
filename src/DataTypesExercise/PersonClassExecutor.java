package DataTypesExercise;

public class PersonClassExecutor {
    static Person per = new Person();

    public static void main(String[] args) {
        System.out.println(per.address);
        System.out.println(per.name1);

        per.Sleep();
        per.Eat();
        per.Run();
        per.Think();
        per.Sleep();
    }

}
