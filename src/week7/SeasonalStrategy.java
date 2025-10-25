package week7;

/**
 * Seasonal strategy: apply a fixed seasonal percentage (can be negative for surcharge).
 */
public class SeasonalStrategy implements PricingStrategy {
    private final double seasonalRate; // e.g., -0.15 for 15% off, +0.05 for 5% surcharge

    public SeasonalStrategy(double seasonalRate) {
        this.seasonalRate = seasonalRate;
    }

    @Override
    public double calculatePrice(double unitPrice, int quantity) {
        double total = unitPrice * quantity;
        return total * (1.0 - seasonalRate);
    }

    @Override
    public String getName() {
        return String.format("Seasonal (%.0f%%)", seasonalRate * 100);
    }
}

