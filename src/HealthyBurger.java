public class HealthyBurger extends Humberger {

    private String healtyExtra1Name;
    private double healtyExtra1Price;

    private String healtyExtra2Name;
    private double healtyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthy1Addition (String name, double price) {
        this.healtyExtra1Name = name;
        this.healtyExtra1Price = price;
    }

    public void addHealthy2Addition (String name, double price) {
        this.healtyExtra2Name = name;
        this.healtyExtra2Price = price;
    }

    @Override
    public double itemizeHambuger() {
        double hamburgerPrice = super.itemizeHambuger();
        if (this.healtyExtra1Name != null) {
            hamburgerPrice += this.healtyExtra1Price;
            System.out.println("Added " + this.healtyExtra1Name + " with extra " + this.healtyExtra1Price);
        }
        if (this.healtyExtra2Name != null) {
            hamburgerPrice += this.healtyExtra2Price;
            System.out.println("Added " + this.healtyExtra2Name + " with extra " + this.healtyExtra2Price);
        }

        return hamburgerPrice;
    }
}
