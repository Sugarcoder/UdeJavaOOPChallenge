
public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "White", "Sausage and Bacon", 8.00);
        super.addHamburgerAddition1("Chips", 3.00);
        super.addHamburgerAddition1("Drink", 2.00);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to deluxe burger");
    }
}
