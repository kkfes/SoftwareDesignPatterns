package week7;

/**
 * No discount applied — simple multiplication.
 */
public class NoDiscountStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(double unitPrice, int quantity) {
        return unitPrice * quantity;
    }

    @Override
    public String getName() {
        return "No Discount";
    }
}

