package com.example.maedirecipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class BMIcalculator extends AppCompatActivity {

    double enteredweight;
    double enteredheight;
    double BMI;
    double totalenteredheight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator);


        final EditText weight = findViewById(R.id.numkg);
        final EditText height = findViewById(R.id.numheight);
        final TextView result = ((TextView) findViewById(R.id.txtresultbmi));
        Button cost = (Button) findViewById(R.id.btnbmi);

        cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enteredweight = Double.parseDouble(weight.getText().toString());
                enteredheight = Double.parseDouble(height.getText().toString());
                DecimalFormat hundredth = new DecimalFormat("#.##");
               totalenteredheight =  (enteredheight/100)*(enteredheight/100);
               BMI = enteredweight/totalenteredheight;

                if (BMI < 18.5) {
                    result.setText(hundredth.format(BMI) + " "+"Your are underweight" + " Eat More Fats and Protiens");
                } else if (BMI >= 18.5 && BMI < 24.9) {
                    result.setText(hundredth.format(BMI) + " " + " Your BMI is fine." );
                } else if (BMI >= 24.9 && BMI < 30) {
                    result.setText(hundredth.format(BMI) + " " + "Your are overweight." + "  Eat More Vegetables");
                } else if (BMI >= 30) {
                    result.setText(hundredth.format(BMI) + " " + "Your are overly overweight." +"  Eat More Vegetables");
                }
            }


        });
    }


}
