package kaem0n.u5w1d3.entities;

import java.util.List;

public class Menu {
    private final List<Pizza> pizzas;
    private final List<Drink> drinks;

    public Menu(List<Pizza> pizzas, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizzas=" + pizzas +
                ", drinks=" + drinks +
                '}';
    }
}
