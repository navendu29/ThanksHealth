package com.example.navendu.airtel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by navendu on 26/7/19.
 */

public interface apiService {


    public static  String base_url= "http://192.168.43.138:8080/";

    @GET("authenticate")
    Call<Auth> getAuth(@Query("phoneNumber") String phoneNumber, @Query("password") String password);


}
