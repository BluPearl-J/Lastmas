package services;

import data.models.Owner;
import data.models.Vehicle;
import dtos.requests.RegisterVehicleRequest;
import dtos.responses.RegisterVehicleResponse;

public class VehicleServicesImpl implements VehicleServices {
    public RegisterVehicleResponse registerVehicle (RegisterVehicleRequest request){
        Vehicle vehicle = new Vehicle();
        vehicle.setName(request.getVehicleName());
        vehicle.setModel(request.getVehicleModel());
        vehicle.setColour(request.getVehicleColour());
        vehicle.setYear(request.getProductionYear());

        Owner owner = new Owner();
        owner.setName(request.getOwnerName());
        owner.setAddress(request.getOwnerAddress());
        owner.setPhone(request.getOwnerPhone());


        return null;
    }
}
