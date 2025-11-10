package data.models;

public enum Offence {
    ONE_WAY("One_Way", 20000),
    DRUNK_DRIVING("drunk_driving",7000),
    NO_SEAT_BELT("no_seat_belt",10000),
    OVER_SPEEDING("over_speeding", 4000);

    private String name;
    private double bill;

    Offence(String name, double bill) {
        this.name = name;
        this.bill= bill;
    }


}
