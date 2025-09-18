package week1;

public class Main {
    public static void main(String[] args) {
        Coffee coffeeLatte = new Coffee.Builder("Large", "Latte")
                .milk(true)
                .sugar(2)
                .syrup("Vanilla")
                .build();
        coffeeLatte.setSugarCubes(coffeeLatte.getSugarCubes()+1);
        System.out.println(coffeeLatte.toString());

        Coffee espresso = new Coffee.Builder("Small", "Espresso")
                .sugar(1)
                .build();
        System.out.println(espresso);
    }
}