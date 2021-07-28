package InterfaceExercise.CoffeMaker;

public class ChocolateCoffee implements ICoffeProcedure{

    @Override
    public void TakeACoffeePoweder() {
        System.out.println("Take a 1 spoon of coffee powder");
    }

    @Override
    public void TakeAMilk() {
        System.out.println("Take a 1 cup of cream milk");
    }

    @Override
    public void TakeASugar() {
        System.out.println("Take a chocolate favlour sugar");
    }

    @Override
    public void TakeABowl() {
        System.out.println("Take a bowl for boilling the milk");
    }
}
