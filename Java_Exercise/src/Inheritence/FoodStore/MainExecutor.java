package Inheritence.FoodStore;

public class MainExecutor{
    public static void main(String[] args) {
        HomePage hp = new HomePage();
        hp.SignIn();

        MenuPage mp = new MenuPage();
        mp.SignIn();

        HotelsPage hpp = new HotelsPage();
        hpp.SignIn();
    }
}
