package LoopExercise;

public class BreakStatmentExercise {
    public static void main(String[] args) {
        //break
        //print 1 to 10
        for(int i=1;i<=10;i++){
            System.out.println(i);
            if(i==5){
                System.out.println("Breaking when the value of i is 5......");
                break;
            }
        }

        int i = 1;
        switch (i){
            case 1:
                break;
            case 2:
                break;
            default:
        }

        int j =1;
        while(j < 100){
            System.out.println("Inside while loop ......"+ j++);
            if(j==10){
                break;
            }
        }
    }
}
