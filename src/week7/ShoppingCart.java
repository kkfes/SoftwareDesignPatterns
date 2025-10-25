package week7;

import java.util.ArrayList;
import java.util.List;

/**
 * Context that uses a PricingStrategy to calculate totals.
 */
public class ShoppingCart {
    private final List<CartItem> items = new ArrayList<>();
    private PricingStrategy strategy;

    public ShoppingCart(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void addProduct(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
    }

    public double calculateTotal() {
        double total = 0.0;
        for (CartItem it : items) {
            total += strategy.calculatePrice(it.product.getUnitPrice(), it.quantity);
        }
        return total;
    }

    public String getStrategyName() {
        return strategy.getName();
    }

    private static class CartItem {
        final Product product;
        final int quantity;

        CartItem(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }
    }
}

