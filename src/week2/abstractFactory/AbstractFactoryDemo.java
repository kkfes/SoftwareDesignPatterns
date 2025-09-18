package week2.abstractFactory;
import java.util.Scanner;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose kitchen (italian/kazakh): ");
        String choice = scanner.nextLine();

        KitchenFactory factory;

        if (choice.equalsIgnoreCase("italian")) {
            factory = new ItalianKitchenFactory();
        } else if (choice.equalsIgnoreCase("kazakh")) {
            factory = new KazakhKitchenFactory();
        } else {
            throw new IllegalArgumentException("Unknown cuisine: " + choice);
        }

        Breakfast breakfast = factory.createBreakfast();
        Drink drink = factory.createDrink();

        breakfast.serve();
        drink.serve();
    }
}
