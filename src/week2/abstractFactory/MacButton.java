package week2.abstractFactory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Mac-style Button.");
    }
}