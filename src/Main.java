/**
 * Created by Sugarcoder on 8/31/2015.
 */
public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "White", "Sausage", 3.50);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.50);
        hamburger.addHamburgerAddition2("Lettuce", 0.50);
        hamburger.addHamburgerAddition3("Cheese", 1.50);
        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.25);
        healthyBurger.addHamburgerAddition1("Egg", 0.50);
        healthyBurger.addHealthyAddition1("Onion", 0.30);

        System.out.println("Healthy burger price is " + healthyBurger.itemizeHamburger());


        DeluxeBurger dbBurger = new DeluxeBurger();
        dbBurger.itemizeHamburger();
    }

}
