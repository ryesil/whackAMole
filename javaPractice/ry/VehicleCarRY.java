package javaPractice.ry;

public class VehicleCarRY extends VehicleRY {
    private boolean isLuxury;

    public VehicleCarRY(String make, String model, double rentalRate, boolean isLuxury) {
        super(make, model, rentalRate);
        this.isLuxury = isLuxury;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (days * this.getRentalRate()) * 1.2;
    }
}