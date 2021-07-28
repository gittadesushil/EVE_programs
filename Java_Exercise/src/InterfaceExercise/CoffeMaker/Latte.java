package InterfaceExercise.CoffeMaker;

public class Latte implements ICoffeProcedure{
    @Override
    public void TakeACoffeePoweder() {
        System.out.println("Take a Coffee powder 3 small spoon");
    }

    @Override
    public void TakeAMilk() {
        System.out.println("Take a half cup of cow milk");
    }

    @Override
    public void TakeASugar() {
        System.out.println("Take a one spoon sugar");
    }

    @Override
    public void TakeABowl() {
        System.out.println("Take a bowl for boiling the milk");
    }
}
