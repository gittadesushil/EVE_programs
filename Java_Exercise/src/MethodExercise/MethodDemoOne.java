package MethodExercise;

public class MethodDemoOne {

    //constructor, deafault constructor, 0 parameter constructor
    public MethodDemoOne(){
        System.out.println("DEFAULT constructor");
    }

    //1 parameter constructor
    public MethodDemoOne(String parameter1){
        System.out.println("ONE PARAMETER constructor");
    }

    //2 parameter constructor
    public MethodDemoOne(String parameter1, String parameter2){
        System.out.println("TWO PARAMETER constructor ==> " + parameter1 + ":" + parameter2);
    }

    //4 parameter constructor
    public MethodDemoOne(String parameter1, int parameter2, float parameter3, char parameter4){
        System.out.println("FOUR PARAMETER constructor");
    }


    //0 parameter method
    public void MethodOne(){

    }

    //1 parameter method
    public void MethodTwo(float parameter1){

    }

    //3 parameter method
    public void MethodThree(char param1, float param2, String param3){

    }

    //4 parameter method
    public void MethodFour(String param1, String param2){

    }





}
