package vn.edu.usth.testagain;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import vn.edu.usth.testagain.models.Welcome;
import vn.edu.usth.testagain.retrofit.ApiClient;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private RecyclerView recyclerView;
    private FlightAdapter flightAdapter;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        flightAdapter = new FlightAdapter(new ArrayList<>());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(flightAdapter);

        loadData();

        drawerLayout = findViewById(R.id.main);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View navHeader = navigationView.getHeaderView(0);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        String title = "Home";
        Fragment selectedFragment = null;

        if (itemId == R.id.nav_home) {
//                    selectedFragment = new HomeFragment();
//                    title = "Home";
        } else if (itemId == R.id.nav_view_all_flights) {
//                    selectedFragment = new AllFlightsFragment();
//                    title = "All Flights";
        } else if (itemId == R.id.nav_edit_profile) {
//                    selectedFragment = new EditProfilePassengerFragment();
//                    title = "Edit Profile";
        } else if (itemId == R.id.nav_logout) {
//                    Toast.makeText(this, "Logout!", Toast.LENGTH_SHORT).show();
//                    sharedPrefManager.writeBoolean(IS_LOGGED_IN, false);
//                    sharedPrefManager.apply();
//                    Intent intent = new Intent(PassengerHomeActivity.this, MainActivity.class);
//                    startActivity(intent);
//                    finish();
//                    return true;
        }
        navigationView.setCheckedItem(item.getItemId());
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
//                if (selectedFragment != null) {
//                replaceFragment(selectedFragment);
//                sharedPrefManager.writeToolbarTitle(title);
//                sharedPrefManager.apply();
//                toolbarTitle.setText(title);
                }




    private void loadData() {
        ApiClient.getInstance().getAPIService()
                .getFlightInfo("0f8a9c540d98e7ab39517e8a52c108c5")
                .enqueue(new Callback<Welcome>() {
                    @Override
                    public void onResponse(@NonNull Call<Welcome> call, @NonNull Response<Welcome> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            flightAdapter.setFlights(response.body().getFlights());
                        } else {
                            Log.e("MainActivity", "Response Error: " + response.code());
                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<Welcome> call, @NonNull Throwable t) {
                        Log.e("MainActivity", "API Failure: " + t.getMessage());
                    }
                });
    }
}