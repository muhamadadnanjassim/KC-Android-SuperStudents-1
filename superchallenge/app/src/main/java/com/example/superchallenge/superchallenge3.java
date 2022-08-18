package com.example.superchallenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class superchallenge3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superchallenge3);

        //background Animation
        ConstraintLayout constraintLayout = findViewById(R.id.mainLyout3);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        TextView T1 = findViewById(R.id.T7);
        TextView T2 = findViewById(R.id.T8);
        Button B1 = findViewById(R.id.B7);
        CardView C5 = findViewById(R.id.C5);

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent Homescreen = new Intent(superchallenge3.this,MainActivity.class);
                startActivity(Homescreen);
            }
        });

    }
}