package com.example.neelpatel.foodapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Neel Patel on 10/16/2017.
 */

public class ListOfCuisines extends Activity{

    final String TAG = "Failure sorry :(";
    MainActivity mainActivity = new MainActivity();
    Cuisines cuisines;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listofcuisines);
        recyclerView = (RecyclerView) findViewById(R.id.recycleCuisines);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);
        Call<Example> call = apiService.getCuisines(mainActivity.getCurrentLatitude(),
                mainActivity.getCurrentLongitude(), cuisines.getCuisine(), API_KEY.getApiKey());
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example>call, Response<Example> response) {
                List<Restaurant> restaurants = response.body().getRestaurants();
                recyclerView.setAdapter(new Adapter(restaurants, R.layout.adapter, getApplicationContext()));
            }

            @Override
            public void onFailure(Call<Example>call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
    }
}
