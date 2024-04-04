package kaem0n.u5w1d3;

import kaem0n.u5w1d3.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Configuration
public class AppConfig {
    @Bean
    public Drink getWater() {
        return new Drink(1.99, 50, "Acqua minerale 1/2l", 500);
    }

    @Bean
    public Drink getBeer() {
        return new Drink(3.99, 250, "Birra Kartoffeln", 330);
    }

    @Bean
    public Drink getCola() {
        return new Drink(2.99, 300, "Coca Cola (vetro)", 330);
    }

    @Bean
    public Topping getTomato() {
        return new Topping(0, 100, "Pomodoro");
    }

    @Bean
    public Topping getMozzarellaBase() {
        return new Topping(0, 150, "Mozzarella");
    }

    @Bean
    public Topping getChips() {
        return new Topping(0.50, 180, "Patatine");
    }
    @Bean
    public Topping getHam() {
        return new Topping(0.50, 220, "Prosciutto crudo");
    }
    @Bean
    public Topping getSalami() {
        return new Topping(0.50, 180, "Salame");
    }
    @Bean
    public Topping getNduja() {
        return new Topping(0.50, 180, "'nduja");
    }

    @Bean
    public Topping getDoubleMozzarella() {
        return new Topping(0.50, 150, "Doppia Mozzarella");
    }

    private List<Topping> getPizzaBase() {
        List<Topping> base = new ArrayList<>();
        base.add(getTomato());
        base.add(getMozzarellaBase());
        return base;
    }

    @Bean
    public Pizza getMargherita() {
        return new Pizza("Margherita", getPizzaBase());
    }

    @Bean
    public Pizza getPatatosa() {
        List<Topping> toppings = getPizzaBase();
        toppings.add(getChips());
        return new Pizza("Patatosa", toppings);
    }

    @Bean
    public Pizza getProsciuttosa() {
        List<Topping> toppings = getPizzaBase();
        toppings.add(getHam());
        return new Pizza("Prosciuttosa", toppings);
    }

    @Bean
    public Pizza getSalamosa() {
        List<Topping> toppings = getPizzaBase();
        toppings.add(getSalami());
        return new Pizza("Salamosa", toppings);
    }

    @Bean
    public Pizza getCalabrese() {
        List<Topping> toppings = getPizzaBase();
        toppings.add(getNduja());
        toppings.add(getDoubleMozzarella());
        toppings.add(getSalami());
        return new Pizza("Calabrese", toppings);
    }

    @Bean
    public Menu getMenu() {
        List<Drink> drinks = new ArrayList<>();
        List<Pizza> pizzas = new ArrayList<>();
        drinks.add(getWater());
        drinks.add(getCola());
        drinks.add(getBeer());
        pizzas.add(getMargherita());
        pizzas.add(getPatatosa());
        pizzas.add(getProsciuttosa());
        pizzas.add(getSalamosa());
        pizzas.add(getCalabrese());
        return new Menu(pizzas, drinks);
    }

    @Bean
    @Scope("prototype")
    public int getTableNumber() {
        return new Random().nextInt(1, 21);
    }

    @Bean
    @Scope("prototype")
    public int getSeats() {
        return new Random().nextInt(2, 11);
    }
}
