package kaem0n.u5w1d3.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Food {
    protected String name;
    @Setter
    protected double price;
    @Setter
    protected int kcal;

    public Food(String name, double price, int kcal) {
        this.name = name;
        this.price = price;
        this.kcal = kcal;
    }

    public Food() {
    }
}
