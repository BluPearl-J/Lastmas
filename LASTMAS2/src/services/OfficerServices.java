package services;

import data.models.Officer;
import data.models.Ticket;
import data.models.Vehicle;
import dtos.requests.
        RegisterOfficerRequest;
import dtos.responses.RegisterOfficerResponse;

public interface OfficerServices {
RegisterOfficerResponse registerOfficer(RegisterOfficerRequest request);

}
