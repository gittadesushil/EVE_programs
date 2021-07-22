package LoopExercise;

public class AdvanceForLoop {
    public static void main(String[] args) {
        String arr[] = {"apple","banana","orange","kiwi"};

        for( int i=0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
        //Advanced for loop

        //for(a_datatype_of_single_element variable_name: array/collection)

        //Question: when to use for and for-each loop
        //Answer: for-each loop is simple and easier to use. for-each loop is always preferred over the for loop
        //it's a matter of choice.
        System.out.println("For each loop .....");
        for(String elemennt:arr){
            System.out.println(elemennt);
        }

        int[] nums = {1,2,3,4,5,6,7,'A'};

        for(int ABC: nums){
            System.out.println(ABC);
        }
    }
}
