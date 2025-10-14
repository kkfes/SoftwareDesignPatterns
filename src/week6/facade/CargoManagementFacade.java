package week6.facade;

import week6.decorator.CargoService;

public class CargoManagementFacade {
    private final CargoBookingSubsystem bookingSubsystem;
    private final PaymentSubsystem paymentSubsystem;
    private final TrackingSubsystem trackingSubsystem;

    public CargoManagementFacade() {
        this.bookingSubsystem = new CargoBookingSubsystem();
        this.paymentSubsystem = new PaymentSubsystem();
        this.trackingSubsystem = new TrackingSubsystem();
    }

    public void processShipment(String cargoId, CargoService service) {
        bookingSubsystem.bookCargo(cargoId);
        paymentSubsystem.processPayment(service.calculateCost());
        trackingSubsystem.startTracking(cargoId);
        System.out.println("Service Details: " + service.getDescription());
    }
}