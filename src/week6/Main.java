package week6;

import week6.decorator.*;
import week6.facade.CargoManagementFacade;

public class Main {
    public static void main(String[] args) {
        CargoService baseService = new BaseCargoService(200.0, "Standard Cargo");

        CargoService decoratedService = new ExpressDeliveryDecorator(
                new InsuranceDecorator(
                        new FragileDecorator(baseService)));

        CargoManagementFacade facade = new CargoManagementFacade();
        facade.processShipment("CARGO-101", decoratedService);
    }
}
