package javaPractice.ry;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalServiceRY {
    private List<VehicleRY> vehicles = new ArrayList<>();

    public void addVehicle(VehicleRY vehicleRY) {
        this.vehicles.add(vehicleRY);
    }

    public double calculateTotalRevenue(int[] days) {
        double total = 0;
        for (int i = 0; i < (days.length < vehicles.size() ? days.length : vehicles.size()); i++) {
            total += vehicles.get(i).calculateRentalCost(days[i]);
        }
        return total;
    }
}