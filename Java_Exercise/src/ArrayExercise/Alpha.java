package ArrayExercise;

public class Alpha {
    public void MethodOne(){

    }

    public int[] MethodTwo(String[] arr){
        int[] intArr = {1,2};
        return intArr;
    }

    //4 parameter
    //String array, float array, boolean array, boolean data
    public char[] MethodThree(String[] arr, float[] ft, boolean[] bl,boolean data){
       char[] chArr = {'a','b','c','d'};
        return chArr;
    }

    //return fixed array of size 10 of type int
    public int[] MethodFour(){
        int[] intArr = new int[10];
        return intArr;
    }
}
