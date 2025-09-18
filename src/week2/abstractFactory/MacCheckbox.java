package week2.abstractFactory;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Mac-style Checkbox.");
    }
}