package com.example.neelpatel.foodapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Neel Patel on 10/4/2017.
 */

public class Categories extends Activity{

    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    private String categories;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);
        buttonOne = (Button) findViewById(R.id.button1);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCategories(buttonOne.getText().toString());
                Intent i = new Intent(Categories.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonTwo = (Button) findViewById(R.id.button2);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCategories(buttonTwo.getText().toString());
                Intent i = new Intent(Categories.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonThree = (Button) findViewById(R.id.button3);
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCategories(buttonThree.getText().toString());
                Intent i = new Intent(Categories.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonFour = (Button) findViewById(R.id.button4);
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCategories(buttonFour.getText().toString());
                Intent i = new Intent(Categories.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonFive = (Button) findViewById(R.id.button5);
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCategories(buttonFive.getText().toString());
                Intent i = new Intent(Categories.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonSix = (Button) findViewById(R.id.button6);
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCategories(buttonSix.getText().toString());
                Intent i = new Intent(Categories.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonSeven = (Button) findViewById(R.id.button7);
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCategories(buttonSeven.getText().toString());
                Intent i = new Intent(Categories.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonEight = (Button) findViewById(R.id.button8);
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCategories(buttonEight.getText().toString());
                Intent i = new Intent(Categories.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
        buttonNine = (Button) findViewById(R.id.button9);
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCategories(buttonNine.getText().toString());
                Intent i = new Intent(Categories.this, ListOfCuisines.class);
                startActivity(i);
            }
        });
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }
}
