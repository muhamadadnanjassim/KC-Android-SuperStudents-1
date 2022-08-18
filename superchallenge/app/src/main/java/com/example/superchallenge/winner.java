package com.example.superchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class winner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);
        ImageView imagewin = findViewById(R.id.imagewinner);
        TextView winner = findViewById(R.id.winner);

        imagewin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent homescreen = new Intent(winner.this, MainActivity.class);
                startActivity(homescreen);
            }
        });
    }
}