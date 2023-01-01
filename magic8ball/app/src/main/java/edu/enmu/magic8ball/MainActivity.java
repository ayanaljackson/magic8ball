package edu.enmu.magic8ball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;
//Ayana Jackson
//Purpose is to generate random number and link it to image to create magic 8 ball
//October 17, 2022
public class MainActivity extends AppCompatActivity{





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variables with its ID
        final ImageView imageAsk = (ImageView) findViewById(R.id.askMe);
        Button buttonAsk = (Button) findViewById(R.id.Askbutton);

        //array to store all images
        final int ballImages[] = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five};

        //onClick function
        buttonAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //random number 1-5
                Random random = new Random();
                int x = random.nextInt(4);

                //set image according to int
                imageAsk.setImageResource(ballImages[x]);
            }
        });

    }

}