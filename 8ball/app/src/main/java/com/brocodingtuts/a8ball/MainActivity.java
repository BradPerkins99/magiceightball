package com.brocodingtuts.a8ball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    //set private refference to the image view and answer
    private ImageView ballIV;
    private TextView answerTV;

    private String[] answersArray = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it", "As I see it, yes",
                        "Most likely", "Outlook good", "Yes", "Signs point to yes", "Reply hazy try again", "Ask again later",
                        "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it",
                        "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //image ref
        ballIV = findViewById(R.id.magic_ball);
        //answer textview ref
        answerTV = findViewById(R.id.answer);

        //there are a few ways to set the listener
        //example 1
//        ball.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //explain context
//                Toast.makeText(MainActivity.this, "8 ball was tapped", Toast.LENGTH_SHORT).show();
//            }
//        });

        //example 2 clean way,  when theres more code this as keeps thing a little more cleaner
        ballIV.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //create a switch statement
        switch (v.getId()){
            case R.id.magic_ball:
//                Toast.makeText(MainActivity.this, "8 ball was tapped", Toast.LENGTH_SHORT).show();
                int randomNum = new Random().nextInt(answersArray.length);
                answerTV.setText(answersArray[randomNum]);

                break;
        }
    }

    //Before we go any further we need to make it so the app stays in portrait made at all times,  go to manifest
}
