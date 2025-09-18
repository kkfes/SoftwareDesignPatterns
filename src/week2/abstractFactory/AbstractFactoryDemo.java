package week2.abstractFactory;

import java.util.Scanner;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter OS type (windows/mac): ");
        String os = scanner.nextLine();

        GUIFactory factory;

        if (os.equalsIgnoreCase("windows")) {
            factory = new WindowsFactory();
        } else if (os.equalsIgnoreCase("mac")) {
            factory = new MacFactory();
        } else {
            throw new IllegalArgumentException("Unknown OS: " + os);
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.paint();
    }
}