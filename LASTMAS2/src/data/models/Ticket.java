package data.models;

import java.time.LocalDateTime;

public class Ticket {
        private int id;
        private Vehicle vehicle;
        private Offence offence;
        private boolean hasPaid;
        private Officer issuer;
        LocalDateTime dateOfPayment;
        LocalDateTime dateoFBooking;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Offence getOffence() {
        return offence;
    }

    public void setOffence(Offence offence) {
        this.offence = offence;
    }

    public boolean isHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }

    public Officer getIssuer() {
        return issuer;
    }

    public void setIssuer(Officer issuer) {
        this.issuer = issuer;
    }

    public LocalDateTime getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(LocalDateTime dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }

    public LocalDateTime getDateoFBooking() {
        return dateoFBooking;
    }

    public void setDateoFBooking(LocalDateTime dateoFBooking) {
        this.dateoFBooking = dateoFBooking;
    }
}


