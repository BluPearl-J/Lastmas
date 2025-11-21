package services;

import data.models.Officer;
import data.models.Ticket;
import data.models.Vehicle;

public interface OfficerServices {
void registerOfficer(Officer officer);
void bookVehicleOwner(Vehicle vehicle);
void  issueTicketForTrafficOffence(Ticket ticket);

}
