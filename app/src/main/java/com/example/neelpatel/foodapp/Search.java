package com.example.neelpatel.foodapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Neel Patel on 10/3/2017.
 */

public class Search extends Activity{

    EditText editText;
    Button button;
    RecyclerView recyclerView;
    String input;
    final String TAG = "Failure sorry :(";
    MainActivity mainActivity = new MainActivity();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        recyclerView = (RecyclerView) findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = editText.getText().toString();
                ApiInterface apiService =
                        ApiClient.getClient().create(ApiInterface.class);
                Call<Example> call = apiService.getSearch(mainActivity.getCurrentLatitude(),
                        mainActivity.getCurrentLongitude(), 20, API_KEY.getApiKey());
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
        });
    }
}
