package data.repositories;

import data.models.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class Vehicles implements VehicleRepository {

    private List<Vehicle> vehicles = new ArrayList<>();
    private int countVehicles = 0;


    @Override
    public Vehicle save(Vehicle vehicle) {
        if (vehicle.getId() != 0) return vehicle;
        vehicle.setId(generateId());
        vehicles.add(vehicle);
        return vehicle;
    }


    private int generateId() {
        return ++countVehicles;
    }

    @Override
    public Vehicle findById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                return vehicle;
            }
        }
        return null;
    }

    @Override
    public List<Vehicle> findAll() {
        return vehicles;
    }

    @Override
    public void deleteById(int id) {
        Vehicle toRemove = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                toRemove = vehicle;
                break;
            }
        }
        if (toRemove != null) {
            vehicles.remove(toRemove);
        }
    }

    @Override
    public void deleteAll() {
        vehicles.clear();
    }

    @Override
    public void delete(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    @Override
    public long count() {
        return vehicles.size();
    }
}
