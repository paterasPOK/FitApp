package com.example.fitapp.Remote;
import com.example.fitapp.Model.MyPlaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IGoogleAPIService {
    @GET
    Call<MyPlaces> getNearbyPlaces(@Url String url);

    @GET
    Call<MyPlaces> getDetailPlace(@Url String url);
}
