package ExceptionHandling.Exercise;

public class DemoProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to the java .................");
        int i = 0;
        //i = 1/0;
        try{
            i = 1/0;
        } catch (ArithmeticException ref){
            System.out.println("The exception is catched ....");
            String message = ref.getMessage();
            System.out.println("The exception name is : " + message);
        }

        System.out.println("The value of i is : "+ i);
        System.out.println("Bye Bye ....... See you soon ...........");
    }
}
