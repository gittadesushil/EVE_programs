package MethodOverriding;

public class B extends A{
    public void Jump(){
        System.out.println("from class B");
    }
    public void GetData(String Y, int X){
        super.GetData("sushil",5454);
        System.out.println("from class B");
    }

}
