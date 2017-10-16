package com.example.neelpatel.foodapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Neel Patel on 10/15/2017.
 */

public class SearchAdapter  extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder>{

    private List<Restaurant> restaurants;
    private Context context;
    private int rowLayout;
    public static class SearchViewHolder extends RecyclerView.ViewHolder{
        TextView textOne;
        TextView textTwo;
        TextView textThree;
        TextView textFour;
        TextView textFive;
        TextView textSix;
        public SearchViewHolder(View v) {
            super(v);
            textOne = (TextView) v.findViewById(R.id.textView4);
            textTwo = (TextView) v.findViewById(R.id.textView5);
            textThree = (TextView) v.findViewById(R.id.textView6);
            textFour = (TextView) v.findViewById(R.id.textView7);
            textFive = (TextView) v.findViewById(R.id.textView8);
            textSix = (TextView) v.findViewById(R.id.textView10);
        }
    }

    public SearchAdapter(List<Restaurant> restaurants, int rowLayout, Context context) {
        this.restaurants = restaurants;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public SearchAdapter.SearchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new SearchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SearchAdapter.SearchViewHolder holder, int position) {
        holder.textOne.setText("Name: " + restaurants.get(position).getName());
        holder.textTwo.setText("Cost for two people: " + restaurants.get(position).getAverageCostForTwo());
        holder.textThree.setText("Average rating: " + restaurants.get(position).getUserRating().getAggregateRating());
        holder.textFour.setText("Cuisine: " + restaurants.get(position).getCuisines());
        holder.textFive.setText("Delivering now: " + restaurants.get(position).getIsDeliveringNow());
        holder.textSix.setText("Has Table booking: " + restaurants.get(position).getHasTableBooking());
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }
}
