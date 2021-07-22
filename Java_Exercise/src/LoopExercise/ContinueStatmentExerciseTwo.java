package LoopExercise;

public class ContinueStatmentExerciseTwo {
    public static void main(String[] args) {
        boolean i = true;
        int j = 0;
        while(i || j <0){
            System.out.println(i);
            j++;
            if(j==1){
                continue;
            }
        }
    }
}
