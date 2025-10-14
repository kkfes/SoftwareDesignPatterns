package week6.decorator;

public abstract class CargoDecorator implements CargoService {
    protected CargoService cargoService;

    public CargoDecorator(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    @Override
    public double calculateCost() {
        return cargoService.calculateCost();
    }

    @Override
    public String getDescription() {
        return cargoService.getDescription();
    }
}