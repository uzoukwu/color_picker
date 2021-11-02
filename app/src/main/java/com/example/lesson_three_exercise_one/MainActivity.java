package com.example.lesson_three_exercise_one;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @SuppressLint("NonConstantResourceId")
    public void onRadioButtonClicked(View view) {
        Intent intent = new Intent(this, DisplaySelectedColor.class);
        boolean checked = ((RadioButton) view).isChecked();
        intent.putExtra("color", view.getId());
        startActivity(intent);

        switch (view.getId()) {
            case R.id.rbWhite:
                if (checked){
                    intent.putExtra("color", "WHITE");
                    startActivity(intent);
                }
                break;
            case R.id.rbBlue:
                if (checked){
                    intent.putExtra("color", "BLUE");
                    startActivity(intent);
                }
                break;
            case R.id.rbCyan:
                if (checked){
                    intent.putExtra("color", "CYAN");
                    startActivity(intent);
                }
                break;
            case R.id.rbGreen:
                if (checked){
                    intent.putExtra("color", "GREEN");
                    startActivity(intent);
                }
                break;
            case R.id.rbLightGray:
                if (checked){
                    intent.putExtra("color", "GRAY");
                    startActivity(intent);
                }
                break;
            case R.id.rbMagenta:
                if (checked){
                    intent.putExtra("color", "MAGENTA");
                    startActivity(intent);
                }
                break;
            case R.id.rbRed:
                if (checked){
                    intent.putExtra("color", "RED");
                    startActivity(intent);
                }
                break;
            default:
                intent.putExtra("color", "BLACK");
                startActivity(intent);
        }
    }


}