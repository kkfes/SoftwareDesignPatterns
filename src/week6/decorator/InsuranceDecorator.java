package week6.decorator;

public class InsuranceDecorator extends CargoDecorator {
    public InsuranceDecorator(CargoService cargoService) {
        super(cargoService);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + 50.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Insurance";
    }
}