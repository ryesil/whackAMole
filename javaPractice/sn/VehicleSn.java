package javaPractice.sn;

public abstract class VehicleSn {
    private String make;
    private String model;
    private double rentalRate;

    public VehicleSn(String make, String model, double rentalRate) {
        this.make = make;
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateRentalCost(int days) {
        return days * rentalRate;
    }

}
