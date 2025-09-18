package week2.factoryMethod;

import java.util.Scanner;

public class FactoryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter animal type (dog/cat): ");
        String type = scanner.nextLine();

        Animal animal = AnimalFactory.createAnimal(type);
        animal.speak();
    }
}