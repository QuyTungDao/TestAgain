package vn.edu.usth.testagain.models;

import com.google.gson.annotations.SerializedName;

public class Arrival {
    @SerializedName("airport")
    private String airport;

    @SerializedName("scheduled")
    private String scheduled;

    // Getters and Setters
    public String getAirport() { return airport; }
    public void setAirport(String airport) { this.airport = airport; }

    public String getScheduled() { return scheduled; }
    public void setScheduled(String scheduled) { this.scheduled = scheduled; }
}
