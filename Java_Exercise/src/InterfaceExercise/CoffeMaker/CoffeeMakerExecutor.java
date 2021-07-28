package InterfaceExercise.CoffeMaker;

import java.util.Scanner;

public class CoffeeMakerExecutor {
    public static void main(String[] args) {
        System.out.println("Welcome to the coffee machine ...... :) ");
        System.out.println("Please tell me what kind of coffee you want........ ");

        Scanner sc = new Scanner(System.in);
        String coffeeType = sc.nextLine();

        switch (coffeeType){
            case "lattee":
                LatteCoffee();
            break;
            case "chocolate":
                ChocolateCoffee();
            break;
            default :
                NoramlCoffee();
        }
        System.out.println("Your coffee is ready. Enjoy the coffee...... ");
        System.out.println(".... Come Again ");
    }

    private static void NoramlCoffee() {
        ICoffeProcedure nc = new NormalCoffee();
         nc.TakeACoffeePoweder();
        nc.TakeAMilk();
        nc.TakeASugar();
        nc.TakeABowl();
    }

    private static void LatteCoffee() {
        ICoffeProcedure nc = new Latte();
        nc = new Latte();
        nc.TakeABowl();
        nc.TakeACoffeePoweder();
        nc.TakeAMilk();
        nc.TakeASugar();
    }


    private static void ChocolateCoffee() {
        ICoffeProcedure nc =new ChocolateCoffee();
        nc = new ChocolateCoffee();
        nc.TakeASugar();
        nc.TakeACoffeePoweder();
        nc.TakeAMilk();
        nc.TakeABowl();
    }

}
