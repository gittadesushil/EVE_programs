public class PersonExecutor {
    //main

    //args = arguments
    public static void main(String[] args) {
        System.out.println("Starting point ......");//print statement
        int[] array = {1,2,3,4};
        main(array);
        MethodName();

    }

    public static void main(int[] args) {
        System.out.println("int array method .... not a starting point ......");//print statement
    }

    //0 parameter method
    public static void MethodName(){
        System.out.println("Inside normal method");//print statement
    }


}
