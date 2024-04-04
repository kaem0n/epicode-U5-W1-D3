package kaem0n.u5w1d3.entities;

public class Drink extends Food {
    private final int milliliters;

    public Drink(double price, int kcal, String name, int milliliters) {
        super(name, price, kcal);
        this.milliliters = milliliters;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", milliliters=" + milliliters +
                ", price=" + price +
                ", kcal=" + kcal;
    }
}
