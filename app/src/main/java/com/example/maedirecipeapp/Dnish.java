package com.example.maedirecipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.net.Uri;

public class Dnish extends AppCompatActivity {

    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dnish2);
        Button buttonObject = (Button)findViewById(R.id.btnrateus);
        buttonObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dnish.this, ratingbar.class));}});


        final TextView result1 = findViewById(R.id.txtresult1);
        final TextView result2 = findViewById(R.id.txtresult2);
        final TextView result3 = findViewById(R.id.txtresult33);
        final TextView result4 = findViewById(R.id.txtresult4);
        final TextView result5 = findViewById(R.id.txtresult5);
        final TextView result6 = findViewById(R.id.txtresult6);
        final TextView result7 = findViewById(R.id.txtresult7);
        final TextView result8 = findViewById(R.id.txtresult8);
        final TextView result9 = findViewById(R.id.txtresult9);
        final TextView result10 = findViewById(R.id.txtresult10);
        final TextView result11 = findViewById(R.id.txtresult11);
        final TextView result12 = findViewById(R.id.txtresult12);
        final TextView result13 = findViewById(R.id.txtresult13);
        final TextView result14 = findViewById(R.id.txtresult14);
        final TextView result15 = findViewById(R.id.txtresult15);

        radioGroup = findViewById(R.id.radiogrp1);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radiobtnfamily:
                        result1.setText("Ingredients");
                        result2.setText("1/2 cup oil");
                        result3.setText("7 onion and 5 tomatoes , chopped");
                        result4.setText("1 tbsp minced garlic");
                        result5.setText("4 cups water");
                        result6.setText("3.5 tbsp berbere");
                        result7.setText("2.5 pound beef, cut in 1-inch cubes");
                        result8.setText("6 potatoes, peeles and cubes");
                        result8.setText("Salt and Ground pepper to taste");
                        result10.setText("Steps:");
                        result9.setText("1: In a large pot, heat oil over medium heat. Add the onion to the pot and saute until tender");
                        result11.setText("2: Add the tomato, garlic, berbere to the pot. Cook for 5 minutes by adding small amount of water and stir frequently.");
                        result12.setText("3: Then, place the meat on the pot and cook until tender. Add a small amount of water if necessary and stir the mix in between");
                        result13.setText("4: Add potatoes and 4 cups of water onto the pot. Cook with medium-low heat while string slowly and frequently.Check if potatoes are cooked enough. You can do this by trying to see if one breaks easily with cooking utensils. ");
                        result14.setText("5: Combine the butter, salt and peeper with meat mix. Lower the heat and cook for another 2 min.");
                        result15.setText("Place it aside to cool. Serve it with Injera");
                        break;

                    case R.id.radiobtnone:
                        result1.setText("Ingredients");
                        result2.setText("1/4 cup oil");
                        result3.setText("3 onion and 2 tomatoes , chopped");
                        result4.setText("1/2 tbsp minced garlic");
                        result5.setText("2 cups water");
                        result6.setText("1-2 tbsp berbere");
                        result7.setText("1 pound beef, cut in 1-inch cubes");
                        result8.setText("2 potatoes, peeles and cubes");
                        result8.setText("Salt and Ground pepper to taste");
                        result9.setText("1 In a medium pot, heat oil over medium heat. Add the onion to the pot and saute until tender");
                        result10.setText("Steps:");
                        result11.setText("2: Add the tomato, garlic, berbere to the pot. Cook for 5 minutes by adding small amount of water and stir frequently.");
                        result12.setText("3: Then, place the meat on the pot and cook until tender. Add a small amount of water if necessary and stir the mix in between");
                        result13.setText("4: Add potatoes and 2 cups of water onto the pot. Cook with medium-low heat while string slowly and frequently.Check if potatoes are cooked enough. You can do this by trying to see if one breaks easily with cooking utensils. ");
                        result14.setText("5: Combine the butter, salt and peeper with meat mix. Lower the heat and cook for another 2 min.");
                        result15.setText("Place it aside to cool. Serve it with Injera");

                        break;

                }
            }
        });




        Button button = (Button) findViewById(R.id.btnwebinfo);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(android.content.Intent.ACTION_VIEW);
                open.setData(Uri.parse("https://www.youtube.com/watch?v=KgflxRcE-ws"));
                startActivity(open);

            }
        });




    }
}