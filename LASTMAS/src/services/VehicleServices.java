package services;
import data.models.Vehicle;
import data.repositories.VehicleRepository;

import java.util.List;

public interface VehicleServices {
    void registerVehicle(Vehicle vehicle);
    void bookVehicleOwner(Vehicle vehicle);
    Vehicle getVehicle(int id);
    List<Vehicle> getVehicles();
    boolean deleteVehicle(int id);
}
