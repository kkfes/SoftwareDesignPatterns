package week7;

public class Demo {
    public static void main(String[] args) {
        Product apple = new Product("P1", "Apple", 1.0);
        Product laptop = new Product("P2", "Laptop", 800.0);

        // Start with no discount strategy
        ShoppingCart cart = new ShoppingCart(new NoDiscountStrategy());
        cart.addProduct(apple, 10);
        cart.addProduct(laptop, 1);

        System.out.printf("Strategy: %s, Total: %.2f\n", cart.getStrategyName(), cart.calculateTotal());

        // Switch to bulk discount for apples (threshold 10 -> 10% off overall)
        cart.setStrategy(new BulkDiscountStrategy(10, 0.10));
        System.out.printf("Strategy: %s, Total: %.2f\n", cart.getStrategyName(), cart.calculateTotal());

        // Seasonal discount 15% off
        cart.setStrategy(new SeasonalStrategy(0.15));
        System.out.printf("Strategy: %s, Total: %.2f\n", cart.getStrategyName(), cart.calculateTotal());
    }
}

