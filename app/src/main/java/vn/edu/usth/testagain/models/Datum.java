package vn.edu.usth.testagain.models;

import java.time.LocalDate;

public class Datum {
    private LocalDate flightDate;
    private FlightStatus flightStatus;
    private Arrival departure;
    private Arrival arrival;
    private Airline airline;
    private Flight flight;
    private Object aircraft;
    private Object live;

    public LocalDate getFlightDate() { return flightDate; }
    public void setFlightDate(LocalDate value) { this.flightDate = value; }

    public FlightStatus getFlightStatus() { return flightStatus; }
    public void setFlightStatus(FlightStatus value) { this.flightStatus = value; }

    public Arrival getDeparture() { return departure; }
    public void setDeparture(Arrival value) { this.departure = value; }

    public Arrival getArrival() { return arrival; }
    public void setArrival(Arrival value) { this.arrival = value; }

    public Airline getAirline() { return airline; }
    public void setAirline(Airline value) { this.airline = value; }

    public Flight getFlight() { return flight; }
    public void setFlight(Flight value) { this.flight = value; }

    public Object getAircraft() { return aircraft; }
    public void setAircraft(Object value) { this.aircraft = value; }

    public Object getLive() { return live; }
    public void setLive(Object value) { this.live = value; }
}
