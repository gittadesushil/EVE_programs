package ExceptionHandling.Exercise;

public class DemoProgramTwo {
    public void MethodOne() throws ArrayIndexOutOfBoundsException {
        String[] arr = {"abc","pqr"};
        String value = null;
        value = arr[2];
//        try{
//            value = arr[2];
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Message: "+e.getMessage());
//        }
        System.out.println("The value of index 2 is : "+ value);
    }
}
