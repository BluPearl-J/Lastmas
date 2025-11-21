package services;

import data.models.Ticket;
import java.util.List;


public interface TicketService {
    void addTicket(Ticket ticket);
    Ticket viewTicket(int id);
    List<Ticket> getAllTickets();
    void settleTicket(int id);

}
