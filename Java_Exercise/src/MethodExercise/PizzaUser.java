package MethodExercise;

public class PizzaUser {
    public static void main(String[] args) {
        //PizzaShop shop = new PizzaShop();
        PizzaShop shop2 = new PizzaShop("Hello!, I am from XYZ aUTOMATION PIZZA SHOP, welcome to my shop");

        shop2.ListDownAllAvailablePizza();
        shop2.OrderPizza();
        shop2.PayBill();
        shop2.CancelOrder();
    }
}
