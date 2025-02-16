package javaPractice.sn;

import java.util.ArrayList;
import java.util.List;

public class RentalCarServiceSn {
    List<VehicleSn> vehicleSns = new ArrayList<>();

    public void addVehicleSn(VehicleSn vehicleSn){
        vehicleSns.add(vehicleSn);
    }
    public double calculateTotalRevenue(int[] daysArray){
        if (daysArray.length != vehicleSns.size()) {
            throw new IllegalArgumentException("Mismatch between vehicles and rental days.");
        }
        double totalRevenue = 0;
        for (int i = 0; i < vehicleSns.size(); i++) {
            totalRevenue += vehicleSns.get(i).calculateRentalCost(daysArray[i]);
        }
        return totalRevenue;


    }
}
