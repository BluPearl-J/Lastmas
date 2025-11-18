package data.repositories;

import data.models.Ticket;
import java.util.ArrayList;
import java.util.List;

public class Tickets implements TicketRepository {

    private List<Ticket> tickets = new ArrayList<>();
    private int countTickets = 0;

    @Override
    public Ticket save(Ticket ticket) {
        if (ticket.getId() != 0) return ticket;
        ticket.setId(generateId());
        tickets.add(ticket);
        return ticket;
    }

    private int generateId() {
        return ++countTickets;
    }

    @Override
    public Ticket findById(int id) {
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) return ticket;
        }
        return null;
    }

    @Override
    public List<Ticket> findAll() {
        return tickets;
    }

    @Override
    public void deleteById(int id) {
        Ticket toRemove = null;
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                toRemove = ticket;
                break;
            }
        }
        if (toRemove != null) tickets.remove(toRemove);
    }

    @Override
    public void deleteAll() {
        tickets.clear();
    }

    @Override
    public void delete(Ticket ticket) {
        tickets.remove(ticket);
    }

    @Override
    public long count() {
        return tickets.size();
    }
}
