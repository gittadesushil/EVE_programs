package ArrayExercise;

public class Beta {
    public static void main(String[] args) {
        Alpha obj = new Alpha();

        obj.MethodOne();

        String[] arr = {"one","two"};
        int[] intArr = obj.MethodTwo(arr);

        float[] ft = {1.0f,3.2f};
        boolean[] bl = {true, true, false,true};
        char[] charData = obj.MethodThree(arr,ft,bl,true);

        int[] someIntValue =  obj.MethodFour();
    }
}
