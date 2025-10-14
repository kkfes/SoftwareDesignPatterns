package week6.decorator;

public class FragileDecorator extends CargoDecorator {
    public FragileDecorator(CargoService cargoService) {
        super(cargoService);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + 30.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Fragile Handling";
    }
}