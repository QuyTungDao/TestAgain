package vn.edu.usth.testagain.models;

import com.google.gson.annotations.SerializedName;

public class Flight {

    @SerializedName("flight_date")
    private String flightDate;

    @SerializedName("flight_status")
    private String flightStatus;

    @SerializedName("departure")
    private Departure departure;

    @SerializedName("arrival")
    private Arrival arrival;

    @SerializedName("airline")
    private Airline airline;

    @SerializedName("flight")
    private FlightInfo flightInfo;

    // Getters and Setters
    public String getFlightDate() { return flightDate; }
    public void setFlightDate(String flightDate) { this.flightDate = flightDate; }

    public String getFlightStatus() { return flightStatus; }
    public void setFlightStatus(String flightStatus) { this.flightStatus = flightStatus; }

    public Departure getDeparture() { return departure; }
    public void setDeparture(Departure departure) { this.departure = departure; }

    public Arrival getArrival() { return arrival; }
    public void setArrival(Arrival arrival) { this.arrival = arrival; }

    public Airline getAirline() { return airline; }
    public void setAirline(Airline airline) { this.airline = airline; }

    public FlightInfo getFlightInfo() { return flightInfo; }
    public void setFlightInfo(FlightInfo flightInfo) { this.flightInfo = flightInfo; }

    // Nested class for Flight Info
    public static class FlightInfo {
        @SerializedName("number")
        private String number;

        @SerializedName("icao")
        private String icao;

        public String getNumber() { return number; }
        public void setNumber(String number) { this.number = number; }

        public String getIcao() { return icao; }
        public void setIcao(String icao) { this.icao = icao; }
    }
}
