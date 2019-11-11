package com.example.assignment02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.google.android.material.textfield.TextInputEditText;



public class MainActivity extends AppCompatActivity {

    private ConstraintLayout myLayout;
    private TextInputEditText textEditText;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myLayout = findViewById(R.id.myLayout);
        textEditText = findViewById(R.id.textEditText);

        myLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                String currentDateTimeString = getCurrentDate.getCurrentDate();
                textEditText.setText(currentDateTimeString);
                return true;
            }
        });
    }
}
