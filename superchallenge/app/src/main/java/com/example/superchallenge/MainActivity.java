package com.example.superchallenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //background Animation
        ConstraintLayout constraintLayout = findViewById(R.id.mainLyout);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        //All id
        Button B1 = findViewById(R.id.B1);
        Button B2 = findViewById(R.id.B5);
        TextView RPS = findViewById(R.id.T1);


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gamescreen = new Intent(MainActivity.this,superchallenge2.class);
                startActivity(gamescreen);
            }
        });

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent settings = new Intent(MainActivity.this,superchallenge3.class);
                startActivity(settings);
            }
        });

    }
}