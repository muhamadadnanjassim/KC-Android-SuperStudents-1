package com.example.superchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class loser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loser);
        ImageView imagelose = findViewById(R.id.imagelose);
        TextView loser = findViewById(R.id.loser);

        imagelose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent homescreen = new Intent(loser.this, MainActivity.class);
                startActivity(homescreen);
            }
        });
    }
}