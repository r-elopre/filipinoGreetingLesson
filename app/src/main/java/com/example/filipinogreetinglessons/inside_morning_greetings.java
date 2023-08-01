package com.example.filipinogreetinglessons;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inside_morning_greetings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_morning_greetings);

    }

    public void say_the_greetings(View view){
        Button onclick_button = (Button) view;

        MediaPlayer mediaPlayer = MediaPlayer.create(

                this, getResources().getIdentifier(
                        onclick_button.getTag().toString(),
                        "raw",
                        getPackageName()
                )
        );

        mediaPlayer.start();

    }
}