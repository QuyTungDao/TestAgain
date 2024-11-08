package vn.edu.usth.testagain.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import vn.edu.usth.testagain.models.Welcome;


public interface ApiService {
    @GET("flights")
    Call<Welcome> getFlightInfo(@Query("access_key") String accessKey);
}
