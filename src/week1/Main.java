package week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Coffee coffeeLatte = new Coffee.Builder("Large", "Latte")
                .milk(true)
                .sugar(2)
                .syrup("Vanilla")
                .build();
        System.out.println(coffeeLatte);

        Coffee espresso = new Coffee.Builder("Small", "Espresso")
                .sugar(1)
                .build();
        System.out.println(espresso);
    }
}