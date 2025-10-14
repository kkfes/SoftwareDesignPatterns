package week6.decorator;

public class ExpressDeliveryDecorator extends CargoDecorator {
    public ExpressDeliveryDecorator(CargoService cargoService) {
        super(cargoService);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + 100.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Express Delivery";
    }
}