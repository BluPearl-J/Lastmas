package utils;

import data.models.Officer;
import data.models.Owner;
import data.models.Vehicle;
import dtos.requests.RegisterOfficerRequest;
import dtos.requests.RegisterVehicleRequest;
import dtos.responses.RegisterOfficerResponse;
import dtos.responses.RegisterVehicleResponse;

public class Mapper {

    public static Vehicle map(RegisterVehicleRequest request){
        Vehicle vehicle = new Vehicle();
        vehicle.setName(request.getVehicleName());
        vehicle.setColour(request.getVehicleColour());
        vehicle.setYear(request.getProductionYear());
        vehicle.setModel(request.getVehicleModel());

        Owner owner = new Owner();
        owner.setName(request.getOwnerName());
        owner.setAddress(request.getOwnerAddress());
        owner.setPhone(request.getOwnerPhone());

        vehicle.setOwner(owner);

        return vehicle;
    }

    public static RegisterVehicleResponse mapRegisterVehicleResponse(Vehicle vehicle){
        RegisterVehicleResponse response = new RegisterVehicleResponse();
        response.setVehicleId(vehicle.getId());
        response.setVehicleName(vehicle.getName());
        response.setOwnerName(vehicle.getOwner().getName());
        response.setRegistrationDate(vehicle.getRegistrationDate() + "");
        return response;
    }



    public static Officer mapOfficer(RegisterOfficerRequest request){
        Officer officer = new Officer();
        officer.setName(request.getOfficerName());
        officer.setRank(request.getOfficerRank());

        return officer;
    }


    public static RegisterOfficerResponse mapRegisterOfficerResponse(Officer officer){
        RegisterOfficerResponse response = new RegisterOfficerResponse();
        response.setOfficerId(officer.getId());
        response.setOfficerName(officer.getName());
        response.setOfficerRank(officer.getRank());
        return response;

    }


}
