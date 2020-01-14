package com.example.fitapp;

import com.example.fitapp.Model.MyPlaces;
import com.example.fitapp.Model.Results;
import com.example.fitapp.Remote.IGoogleAPIService;
import com.example.fitapp.Remote.RetrofitClient;

public class Common {

    public static Results currentResult;
    private static final String GOOGLE_API_URL = "https://maps.googleapis.com/";

    public static IGoogleAPIService getGoogleAPIService()
    {
        return RetrofitClient.getClient(GOOGLE_API_URL).create(IGoogleAPIService.class);
    }
}
