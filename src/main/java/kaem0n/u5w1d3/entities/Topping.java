package kaem0n.u5w1d3.entities;

public class Topping extends Food {
    public Topping(double price, int kcal, String name) {
        super(name, price, kcal);
    }

    @Override
    public String toString() {
        return name;
    }
}
