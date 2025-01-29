package javaPractice.ry;

public class VehicleTruckRY extends VehicleRY {
    private double loadCapacity;

    public VehicleTruckRY(String make, String model, double rentalRate, double loadCapacity) {
        super(make, model, rentalRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        if (loadCapacity > 1000) {
            return days * this.getRentalRate() + 50;
        } else {
            return days * this.getRentalRate();
        }
    }
}