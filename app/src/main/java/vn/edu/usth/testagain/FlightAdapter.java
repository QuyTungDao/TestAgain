package vn.edu.usth.testagain;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import vn.edu.usth.testagain.models.Flight;

public class FlightAdapter extends RecyclerView.Adapter<FlightAdapter.ViewHolder> {

    private List<Flight> flights;

    public FlightAdapter(List<Flight> flights) {
        this.flights = flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.info, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Flight flight = flights.get(position);

        holder.tvFrom.setText(flight.getDeparture().getAirport());
        holder.tvstd.setText(flight.getDeparture().getScheduled());
        holder.tvTo.setText(flight.getArrival().getAirport());
        holder.tvsta.setText(flight.getArrival().getScheduled());

        // Display ICAO code instead of flight number
        if (flight.getFlightInfo() != null && flight.getFlightInfo().getIcao() != null) {
            holder.textViewFlightNumber.setText(flight.getFlightInfo().getIcao());
        } else {
            holder.textViewFlightNumber.setText("N/A"); // Default if no ICAO code
        }
    }

    @Override
    public int getItemCount() {
        return flights.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvFrom, tvstd, tvTo, tvsta, textViewFlightNumber;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvFrom = itemView.findViewById(R.id.tvFrom);
            tvstd = itemView.findViewById(R.id.tvstd);
            tvTo = itemView.findViewById(R.id.tvTo);
            tvsta = itemView.findViewById(R.id.tvsta);
            textViewFlightNumber = itemView.findViewById(R.id.textViewFlightNumber);
        }
    }
}
