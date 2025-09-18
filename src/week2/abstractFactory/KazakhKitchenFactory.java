package week2.abstractFactory;

public class KazakhKitchenFactory implements KitchenFactory {
    @Override
    public Breakfast createBreakfast() {
        return new Besh();
    }

    @Override
    public Drink createDrink() {
        return new Qymyz();
    }
}
