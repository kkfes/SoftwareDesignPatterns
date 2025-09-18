package week2.abstractFactory;

public class Coffee implements Drink {
    @Override
    public void serve() {
        System.out.println("Serving strong Italian Coffee.");
    }
}
