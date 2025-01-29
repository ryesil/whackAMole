package javaPractice.ry;

public abstract class VehicleRY {
    private String make;
    private String model;
    private double rentalRate;

    public VehicleRY(String make, String model, double rentalRate) {
        this.make = make;
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);
}
