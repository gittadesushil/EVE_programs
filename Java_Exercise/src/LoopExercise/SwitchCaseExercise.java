package LoopExercise;

import java.util.Scanner;

public class SwitchCaseExercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("case 1 executed");
                break;
            case 10:
                System.out.println("case 2 executed");
                break;
            case 0:
                System.out.println("case 3 executed");
                break;
            default:
                System.out.println("Nothing is exeucted");
        }
        System.out.println("Outside switch ....");
    }
}
