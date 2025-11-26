package services;

import data.models.Owner;
import data.models.Vehicle;
import data.repositories.VehicleRepository;
import data.repositories.Vehicles;
import dtos.requests.RegisterVehicleRequest;
import dtos.responses.RegisterVehicleResponse;

import static utils.Mapper.map;
import static utils.Mapper.mapRegisterVehicleResponse;

public class VehicleServicesImpl implements VehicleServices {
    private VehicleRepository vehicleRepository = new Vehicles();

    public RegisterVehicleResponse registerVehicle (RegisterVehicleRequest request){
       Vehicle vehicle =  map(request);
       Vehicle savedVehicle = vehicleRepository.save(vehicle);
       return mapRegisterVehicleResponse(savedVehicle);
    }
}
