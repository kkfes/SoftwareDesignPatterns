package week7;

/**
 * Strategy interface for pricing calculations.
 */
public interface PricingStrategy {
    /**
     * Calculate total price for given base unit price and quantity.
     */
    double calculatePrice(double unitPrice, int quantity);

    /**
     * Human-readable name of the strategy (for reporting).
     */
    String getName();
}

