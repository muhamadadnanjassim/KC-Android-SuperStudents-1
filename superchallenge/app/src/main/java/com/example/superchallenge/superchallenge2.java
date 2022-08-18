package com.example.superchallenge;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class superchallenge2 extends AppCompatActivity {

    Button b_rock, b_paper, b_scissors;
    TextView tv_yscore, tv_bscore,botchoose;
    ImageView iv_ComputerChoice, iv_HumanChoice;
    int HumanScore, ComputerScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superchallenge2);

        //background Animation
        ConstraintLayout constraintLayout = findViewById(R.id.mainLyout2);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();

        //All id
//        TextView botchoose = findViewById(R.id.T2);
        TextView YOU = findViewById(R.id.T3);
        TextView BOT = findViewById(R.id.T4);
        TextView BOTpoint = findViewById(R.id.you);
        TextView YOUpoint = findViewById(R.id.bot);
        ImageView homescreen = findViewById(R.id.IMG4);
        b_rock = (Button) findViewById(R.id.B2);
        b_paper = (Button) findViewById(R.id.B3);
        b_scissors = (Button) findViewById(R.id.B4);
        iv_ComputerChoice = (ImageView) findViewById(R.id.IMG1);
        iv_HumanChoice = (ImageView) findViewById(R.id.IMG2);
        botchoose = findViewById(R.id.T2);

        tv_yscore = (TextView) findViewById(R.id.you);
        tv_bscore = (TextView) findViewById(R.id.bot);

        homescreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent homescreen = new Intent(superchallenge2.this, MainActivity.class);
                startActivity(homescreen);
            }
        });


////////////////////////////////////////////////////////////////////////////////////////////////////////////

        b_rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_HumanChoice.setImageResource(R.drawable.stone2);
                String message = paly_turn("rock");
                Toast.makeText(superchallenge2.this, message, Toast.LENGTH_SHORT).show();
                tv_bscore.setText("Score : " + Integer.toString(ComputerScore));
                tv_yscore.setText("Score : " + Integer.toString(HumanScore));
                if(HumanScore == 10) {
                    Intent homeScreen = new Intent(superchallenge2.this, winner.class);
                    startActivity(homeScreen);
                }
                if(ComputerScore == 10) {
                    Intent homeScreen = new Intent(superchallenge2.this, loser.class);
                    startActivity(homeScreen);
                }
            }
        });

        b_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_HumanChoice.setImageResource(R.drawable.paper2);
                String message = paly_turn("paper");
                Toast.makeText(superchallenge2.this, message, Toast.LENGTH_SHORT).show();
                tv_bscore.setText("Score Bot: " + Integer.toString(ComputerScore));
                tv_yscore.setText("Score Human: " + Integer.toString(HumanScore));
                if(HumanScore == 10) {
                    Intent homeScreen = new Intent(superchallenge2.this, winner.class);
                    startActivity(homeScreen);
                }
                if(ComputerScore == 10) {
                    Intent homeScreen = new Intent(superchallenge2.this, loser.class);
                    startActivity(homeScreen);
                }
            }
        });

        b_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_HumanChoice.setImageResource(R.drawable.scissors);
                String message = paly_turn("scissors");
                Toast.makeText(superchallenge2.this, message, Toast.LENGTH_SHORT).show();
                tv_bscore.setText("Score : " + Integer.toString(ComputerScore));
                tv_yscore.setText("Score : " + Integer.toString(HumanScore));
                if(HumanScore == 10) {
                    Intent homeScreen = new Intent(superchallenge2.this, winner.class);
                    startActivity(homeScreen);
                }
                    if(ComputerScore == 10) {
                        Intent homeScreen = new Intent(superchallenge2.this, loser.class);
                        startActivity(homeScreen);
                    }
            }
        });

    }


    public String paly_turn(String player_choise) {
        String computer_choise = "";
        Random r = new Random();

        int computer_choise_number = r.nextInt(3) + 1;

        if (computer_choise_number == 1) {
            computer_choise = "rock";
        } else if (computer_choise_number == 2) {
            computer_choise = "paper";
        } else if (computer_choise_number == 3) {
            computer_choise = "scissors";
        }
        if (computer_choise == "rock") {
            iv_ComputerChoice.setImageResource(R.drawable.stone2);
            botchoose.setText("BOT: ROCK");
        } else if (computer_choise == "paper") {
            iv_ComputerChoice.setImageResource(R.drawable.paper2);
            botchoose.setText("BOT: PAPER");
        } else if (computer_choise == "scissors") {
            iv_ComputerChoice.setImageResource(R.drawable.scissors);
            botchoose.setText("BOT: SCISSORS");
        }

        if (computer_choise == player_choise) {
            return "Drew";
        } else if (player_choise == "rock" && computer_choise == "scissors") {
            HumanScore++;
            return "Rock crushes scissors. You Win";
        } else if (player_choise == "scissors" && computer_choise == "rock") {
            ComputerScore++;
            return "paper covers rock. You Lose";
        } else if (player_choise == "scissors" && computer_choise == "rock") {
            ComputerScore++;
            return "Rock crushes scissors. You Lose";
        } else if (player_choise == "scissors" && computer_choise == "paper") {
            HumanScore++;
            return "scissors cuts paper. You Win";
        } else if (player_choise == "paper" && computer_choise == "rock") {
            HumanScore++;
            return "paper covers rock. You Win";
        } else if (player_choise == "paper" && computer_choise == "scissors") {
            ComputerScore++;
            return "scissors cuts paper. You Lose";
        } else if (player_choise == "rock" && computer_choise == "paper") {
            ComputerScore++;
            return "scissors cuts paper. You Lose";
        }
        else return "not sure";
    }
}