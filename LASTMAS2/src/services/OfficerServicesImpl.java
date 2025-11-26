package services;

import data.models.Officer;
import data.models.Vehicle;
import data.repositories.OfficerRepository;
import data.repositories.Officers;
import data.repositories.VehicleRepository;
import data.repositories.Vehicles;
import dtos.requests.RegisterOfficerRequest;
import dtos.requests.RegisterVehicleRequest;
import dtos.responses.RegisterOfficerResponse;
import dtos.responses.RegisterVehicleResponse;

import static utils.Mapper.*;


public class OfficerServicesImpl implements OfficerServices {

       private OfficerRepository officerRepository = new Officers();

       public RegisterOfficerResponse registerOfficer(RegisterOfficerRequest request){
          Officer officer =  mapOfficer(request);
           Officer savedOfficer = officerRepository.save(officer);
           return mapRegisterOfficerResponse(savedOfficer);
       }
   }




