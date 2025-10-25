package week7;

/**
 * Bulk discount: if quantity >= threshold, apply percentage discount.
 */
public class BulkDiscountStrategy implements PricingStrategy {
    private final int threshold;
    private final double discountRate; // 0.1 = 10%

    public BulkDiscountStrategy(int threshold, double discountRate) {
        this.threshold = threshold;
        this.discountRate = discountRate;
    }

    @Override
    public double calculatePrice(double unitPrice, int quantity) {
        double total = unitPrice * quantity;
        if (quantity >= threshold) {
            return total * (1.0 - discountRate);
        }
        return total;
    }

    @Override
    public String getName() {
        return String.format("Bulk Discount (%d+ -> %.0f%%)", threshold, discountRate * 100);
    }
}

