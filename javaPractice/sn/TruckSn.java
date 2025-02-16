package javaPractice.sn;

public class TruckSn extends VehicleSn {

    private double loadCapacity;

    public TruckSn(String make, String model, double rentalRate, double loadCapacity) {
        super(make, model, rentalRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        if (loadCapacity > 1000) {
            return super.calculateRentalCost(days) + 50;
        }
        return super.calculateRentalCost(days);
    }
}
