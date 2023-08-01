package com.example.filipinogreetinglessons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button morningBtn, afternoonBtn, eveningBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        morningBtn = findViewById(R.id.button);
        afternoonBtn = findViewById(R.id.button2);
        eveningBtn = findViewById(R.id.button3);



    //morning button
    morningBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent m = new Intent(getApplicationContext(),inside_morning_greetings.class);
            startActivity(m);

        }
    });


    //afternoon button
    afternoonBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent a = new Intent(getApplicationContext(),inside_afternoon_greetings.class);
            startActivity(a);

        }
    });


    //evening button
        eveningBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(getApplicationContext(),inside_evening_greetings.class);
                startActivity(e);

            }
        });



    }
}