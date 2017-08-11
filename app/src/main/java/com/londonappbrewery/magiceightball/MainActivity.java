package com.londonappbrewery.magiceightball;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] fortuneIds = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        final String[] colors = {
                "#9842f4",
                "#41f48f",
                "#f4ca41",
                "#f44141",
                "#f44179"
        };

        Button button_ask = (Button) findViewById(R.id.buttonAsk);
        final ImageView imageView_ball = (ImageView) findViewById(R.id.imageViewBall);
        final RelativeLayout rl_main = (RelativeLayout) findViewById(R.id.activity_main);

        button_ask.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                imageView_ball.setImageResource(fortuneIds[new Random().nextInt(5)]);
                rl_main.setBackgroundColor(Color.parseColor(colors[new Random().nextInt(5)]));
            }
        });

    }
}
