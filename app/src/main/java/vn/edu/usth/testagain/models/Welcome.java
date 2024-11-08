package vn.edu.usth.testagain.models;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Welcome {
    @SerializedName("data")
    private List<Flight> flights;

    // Getter
    public List<Flight> getFlights() { return flights; }
    public void setFlights(List<Flight> flights) { this.flights = flights; }
}
