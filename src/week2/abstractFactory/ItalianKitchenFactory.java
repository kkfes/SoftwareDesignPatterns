package week2.abstractFactory;

public class ItalianKitchenFactory implements KitchenFactory {
    @Override
    public Breakfast createBreakfast() {
        return new Pasta();
    }

    @Override
    public Drink createDrink() {
        return new Coffee();
    }
}
