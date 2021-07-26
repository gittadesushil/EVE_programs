package Inheritence;

public class Dog extends Animal{

    public Dog(){
        System.out.println("SUB CON");
    }

    public void Eat(){
        super.Eat();
        System.out.println("Eating ..... SUB class");
    }
}
