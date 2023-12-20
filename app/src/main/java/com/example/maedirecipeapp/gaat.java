package com.example.maedirecipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class gaat extends AppCompatActivity {
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaat);

        Button buttonObject = (Button)findViewById(R.id.btnrateus);
        buttonObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(gaat.this, ratingbar.class));}});


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
                        result2.setText("2 1/2 cup oil");
                        result3.setText("6 tbsp clarified butter");
                        result4.setText("2 cups milk");
                        result5.setText("1 tsp salt");
                        result6.setText("2 cups water");
                        result7.setText("1 tbsp berbere");
                        result10.setText("Steps:");
                        result9.setText(" 1: Place the flour onto a sieve; and strain and remove the coarse part of the flour that is on the sieve.");
                        result11.setText("2: Add the water, and salt on a mediim pot. Boil over a medium heat");
                        result12.setText("3: Reduce half a cup of the liquid from the pot and place by the side.");
                        result13.setText("4: Combine the flour with the liquid mix by mashing and stirring. Let the mix cook for 3 minutes. And them add a little bit amount of water,cook for 3 minutes and mash the mix; Repeat the process 3 times ");
                        result14.setText("5: Melt the butter on a small bowl. Brush a medium bowl with small amount of butter. Add the gaat on the bowl and roll it on a circular way until the gaat becomes ball shaped.");
                        result15.setText("Create a hole in the center (like in the picture). Fill butter and berbere onto the hole. Serve it right away");
                        break;

                    case R.id.radiobtnone:
                        result1.setText("Ingredients");
                        result2.setText(" 1/2 cup oil");
                        result3.setText("1.5 tbsp clarified butter");
                        result4.setText("1/2 cups milk");
                        result5.setText("1/4 tsp salt");
                        result6.setText("1 cups water");
                        result7.setText("1 tbsp berbere");
                        result10.setText("Steps:");
                        result9.setText("1: Place the flour onto a sieve; and strain and remove the coarse part of the flour that is on the sieve.");
                        result11.setText("2: Add the water, and salt on a mediim pot. Boil over a medium heat");
                        result12.setText("3: Reduce half a cup of the liquid from the pot and place by the side.");
                        result13.setText("4: Combine the flour with the liquid mix by mashing and stirring. Let the mix cook for 3 minutes. And them add a little bit amount of water,cook for 3 minutes and mash the mix; Repeat the process 3 times ");
                        result14.setText("5: Melt the butter on a small bowl. Brush a medium bowl with small amount of butter. Add the gaat on the bowl and roll it on a circular way until the gaat becomes ball shaped.");
                        result15.setText("Create a hole in the center (like in the picture). Fill butter and berbere onto the hole. Serve it right away");

                        break;

                }
            }
        });
        Button button = (Button) findViewById(R.id.btnwebinfo1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent open = new Intent(android.content.Intent.ACTION_VIEW);
                open.setData(Uri.parse("https://www.youtube.com/watch?v=7tjqe3bEA28"));
                startActivity(open);

            }
        });


    }
}