package LoopExercise;

public class WhileExercise {
    public static void main(String[] args) {
//        while(conditioin){
//            //logic
//        }
        int i =1;
        while(i < 100){
            System.out.println("Inside while loop ......"+ i++);
        }

        System.out.println("Outside of while loop ......");

        int j = 1;
        String color = "green";
        while(j < 5){
            System.out.println(color);
            j--;
        }


    }
}
