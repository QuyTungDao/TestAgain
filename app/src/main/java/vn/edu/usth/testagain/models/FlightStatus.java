package vn.edu.usth.testagain.models;

import java.io.IOException;

public enum FlightStatus {
    ACTIVE, SCHEDULED;

    public String toValue() {
        switch (this) {
            case ACTIVE: return "active";
            case SCHEDULED: return "scheduled";
        }
        return null;
    }

    public static FlightStatus forValue(String value) throws IOException {
        if (value.equals("active")) return ACTIVE;
        if (value.equals("scheduled")) return SCHEDULED;
        throw new IOException("Cannot deserialize FlightStatus");
    }
}
