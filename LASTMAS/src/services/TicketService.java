package services;

import data.models.Ticket;
import java.util.List;


public interface TicketService {
    void addTicket(Ticket ticket);
    Ticket viewTicket(int id);
    List<Ticket> getAllTickets();
    void updateTicket(Ticket ticket);
    void deleteTicket(int id);
    void settleTicket(int id);

}
