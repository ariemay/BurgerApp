public class Main {

    public static void main(String[] args) {

    Humberger burger = new Humberger("Basic", "Sausage", 35000, "White");

    double price = burger.itemizeHambuger();
    burger.addHumbergerAddition1("Tomat", 5000);
    burger.addHumbergerAddition2("Keju", 10000);
    burger.addHumbergerAddition3("Sambal", 3000);
    burger.addHumbergerAddition4("Sayur", 5000);
    System.out.println("Total burger price is " + burger.itemizeHambuger());

    HealthyBurger healthyBurger = new HealthyBurger("Bacon", 15000);
    healthyBurger.addHumbergerAddition1("Egg", 5000);
    healthyBurger.addHealthy1Addition("Lentils", 12000);

    System.out.println("Total healthy burger price is " + healthyBurger.itemizeHambuger());


    }
}
