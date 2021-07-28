package InterfaceExercise.CoffeMaker;

public class NormalCoffee implements ICoffeProcedure{
    @Override
    public void TakeACoffeePoweder() {
        System.out.println("Take a Coffee powder 2 spoon");
    }

    @Override
    public void TakeAMilk() {
        System.out.println("Take a 1 cup of cow milk");
    }

    @Override
    public void TakeASugar() {
        System.out.println("Take a 1 spoon of sugar");
    }

    @Override
    public void TakeABowl() {
        System.out.println("Take a bowl for boiling the milk");
    }
}
