package com.example.neelpatel.foodapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Neel Patel on 10/12/2017.
 */

public interface ApiInterface {

    @GET("search")
    Call<Example> getSearch(@Query("lat") double lat, @Query("lon") double lon,
                            @Query("count") int count, @Query("api_key") String apiKey);

    @GET("search")
    Call<Example> getCuisines(@Query("lat") double lat, @Query("lon") double lon,
                            @Query("cuisines") String cuisine, @Query("api_key") String apiKey);

    @GET("search")
    Call<Example> getCategories(@Query("lat") double lat, @Query("lon") double lon,
                              @Query("category") String category, @Query("api_key") String apiKey);

}
