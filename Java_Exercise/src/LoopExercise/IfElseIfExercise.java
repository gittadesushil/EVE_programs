package LoopExercise;

import java.util.Scanner;

public class IfElseIfExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Positive number");
        }else if(num <0){
            System.out.println("Negative number");
        }else if(num ==0){
            System.out.println("IT'S equal");
        }else{
            System.out.println("DEFAULT");
        }
    }
}
