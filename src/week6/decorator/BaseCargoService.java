package week6.decorator;

public class BaseCargoService implements CargoService {
    private final double baseCost;
    private final String description;

    public BaseCargoService(double baseCost, String description) {
        this.baseCost = baseCost;
        this.description = description;
    }

    @Override
    public double calculateCost() {
        return baseCost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}