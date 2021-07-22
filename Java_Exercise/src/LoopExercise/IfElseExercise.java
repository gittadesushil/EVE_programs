package LoopExercise;

import java.util.Scanner;

public class IfElseExercise {
    public static void main(String[] args) {
        //hardcoaded value
        //int num = 10;

        //input the value from user
        Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();

        if(num > 0){
            System.out.println("Hello .....");
        }else{
            System.out.println("Bye .....");
        }
        System.out.println("Something .......");
    }
}
