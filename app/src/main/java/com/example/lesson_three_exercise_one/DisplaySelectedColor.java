package com.example.lesson_three_exercise_one;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class DisplaySelectedColor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_selected_color);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Intent intent = getIntent();
        String mycolor =  intent.getStringExtra("color");

        View background = findViewById(R.id.svBackground);
        background.setBackgroundColor(Color.parseColor(mycolor));


        switch (mycolor) {
            case "WHITE":
                background.setBackgroundColor(Color.WHITE);
                break;
            case "BLUE":
                background.setBackgroundColor(Color.BLUE);
                break;
            case "CYAN":
                background.setBackgroundColor(Color.CYAN);
                break;
            case "GREEN":
                background.setBackgroundColor(Color.GREEN);
                break;
            case "MAGENTA":
                background.setBackgroundColor(Color.MAGENTA);
                break;
            case "RED":
                background.setBackgroundColor(Color.RED);
                break;
            case "GRAY":
                background.setBackgroundColor(Color.LTGRAY);
                break;

            default:
                background.setBackgroundColor(Color.BLACK);
        }



    }
}