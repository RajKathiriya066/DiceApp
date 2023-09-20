package com.practical.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=findViewById(R.id.btn);
        ImageView d1=findViewById(R.id.d1);
        ImageView d2=findViewById(R.id.d2);

        int[] diceNo={R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,R.drawable.dice5,R.drawable.dice6};

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random generator=new Random();
                int generate1=generator.nextInt(6);
                int generate2=generator.nextInt(6);

                d1.setImageResource(diceNo[generate1]);
                d2.setImageResource(diceNo[generate2]);
            }
        });
    }
}