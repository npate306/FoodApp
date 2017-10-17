package com.example.neelpatel.foodapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import retrofit2.Call;

/**
 * Created by Neel Patel on 10/2/2017.
 */

public class Cuisines extends Activity{

    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    private String cuisine;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuisines);
        buttonOne = (Button) findViewById(R.id.button1);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCuisine(buttonOne.getText().toString());
                Intent i = new Intent(Cuisines.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonTwo = (Button) findViewById(R.id.button2);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCuisine(buttonTwo.getText().toString());
                Intent i = new Intent(Cuisines.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonThree = (Button) findViewById(R.id.button3);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCuisine(buttonThree.getText().toString());
                Intent i = new Intent(Cuisines.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonFour = (Button) findViewById(R.id.button4);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCuisine(buttonFour.getText().toString());
                Intent i = new Intent(Cuisines.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonFive = (Button) findViewById(R.id.button5);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCuisine(buttonFive.getText().toString());
                Intent i = new Intent(Cuisines.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonSix = (Button) findViewById(R.id.button6);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCuisine(buttonSix.getText().toString());
                Intent i = new Intent(Cuisines.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonSeven = (Button) findViewById(R.id.button7);
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCuisine(buttonSeven.getText().toString());
                Intent i = new Intent(Cuisines.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonEight = (Button) findViewById(R.id.button8);
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCuisine(buttonEight.getText().toString());
                Intent i = new Intent(Cuisines.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonNine = (Button) findViewById(R.id.button9);
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCuisine(buttonNine.getText().toString());
                Intent i = new Intent(Cuisines.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
}
