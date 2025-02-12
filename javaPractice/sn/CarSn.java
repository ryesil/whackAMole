package javaPractice.sn;

public class CarSn extends VehicleSn {

    private boolean isLuxury;

    public CarSn(String make, String model, double rentalRate, boolean isLuxury) {
        super(make, model, rentalRate);
        this.isLuxury = isLuxury;
    }

    @Override
    public double calculateRentalCost(int days) {
        return isLuxury ? super.calculateRentalCost(days) + 0.20 * days : super.calculateRentalCost(days); // Add 20% for luxury cars
    }
}
