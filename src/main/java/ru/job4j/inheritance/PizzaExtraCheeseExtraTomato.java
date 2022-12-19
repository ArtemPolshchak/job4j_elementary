package ru.job4j.inheritance;

/**
 * @author artem.polschak@gmail.com on 19.12.2022.
 * @project job4j_elementary
 */
public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese{
    @Override
    public String name() {
        return super.name() + " + extra tomato";
    }
}
