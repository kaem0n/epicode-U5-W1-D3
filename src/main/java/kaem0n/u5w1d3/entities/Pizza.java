package kaem0n.u5w1d3.entities;

import lombok.Getter;

import java.util.List;

@Getter
public class Pizza extends Food {
    private final List<Topping> toppings;

    public Pizza(String name, List<Topping> toppings) {
        this.name = name;
        this.toppings = toppings;
        this.price = 6.99;
        this.kcal = 200;
        toppings.forEach(topping -> {
            this.setPrice(this.price + topping.getPrice());
            this.setKcal(this.kcal + topping.getKcal());
        });
    }

    @Override
    public String toString() {
        return "Pizza " + name + " " + toppings +
                ", price=" + price +
                ", kcal=" + kcal;
    }
}
