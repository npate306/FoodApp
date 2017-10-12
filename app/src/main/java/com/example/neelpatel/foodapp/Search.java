package com.example.neelpatel.foodapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Neel Patel on 10/3/2017.
 */

public class Search extends Activity{

    EditText editText;
    Button button;
    RecyclerView recyclerView;
    String input;
    private final static String API_KEY = "e0afea630634e613d01e93ce9bb8d526";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        recyclerView = (RecyclerView) findViewById(R.id.recycle);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = editText.getText().toString();
                if (API_KEY.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Please obtain your API KEY first from themoviedb.org", Toast.LENGTH_LONG).show();
                    return;
                }

                ApiInterface apiService =
                        ApiClient.getClient().create(ApiInterface.class);

                Call<Example> call = apiService.getTopRatedMovies(API_KEY);
                call.enqueue(new Callback<MoviesResponse>() {
                    @Override
                    public void onResponse(Call<MoviesResponse>call, Response<MoviesResponse> response) {
                        List<Movie> movies = response.body().getResults();
                        Log.d(TAG, "Number of movies received: " + movies.size());
                    }

                    @Override
                    public void onFailure(Call<MoviesResponse>call, Throwable t) {
                        // Log error here since request failed
                        Log.e(TAG, t.toString());
                    }
                });
            }
        });
    }
}
