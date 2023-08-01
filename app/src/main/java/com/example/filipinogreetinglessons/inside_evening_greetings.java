package com.example.filipinogreetinglessons;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class inside_evening_greetings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside_evening_greetings);
    }

    public void say_the_greetings3(View view){
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