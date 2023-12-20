package com.example.maedirecipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject = (Button)findViewById(R.id.btnintro);
        buttonObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Introduction.class));}});

        Button buttonObject1 = (Button)findViewById(R.id.btnrecipe);
        buttonObject1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Recipes.class));}});

        Button buttonObject2 = (Button)findViewById(R.id.btncalculator);
        buttonObject2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BMIcalculator.class));}});

    }
}