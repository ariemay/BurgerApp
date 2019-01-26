/**
 * Created by ariemay on Jan, 2019
 */

public class DeluxeBurger extends Humberger{
    @Override
    public void addHumbergerAddition1(String name, double price) {
        System.out.println("Cannot add any...");
    }

    @Override
    public void addHumbergerAddition2(String name, double price) {
        System.out.println("Cannot add any...");
    }

    @Override
    public void addHumbergerAddition3(String name, double price) {
        System.out.println("Cannot add any...");
    }

    @Override
    public void addHumbergerAddition4(String name, double price) {
        System.out.println("Cannot add any...");
    }

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 60000, "White");
        super.addHumbergerAddition1("Chip", 10000);
        super.addHumbergerAddition2("Drink", 20000);



    }
}
