package com.example.thedice;

import androidx.appcompat.app.AppCompatActivity;

import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.BreakIterator;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static ImageButton imageButton;
    private int textView1 ;
    private int i;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(listener);



                                                  }

        private View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View view){
                TextView textView1 = findViewById(R.id.textView);
                int min = 1;
                int max = 6;
                int diff = max - min;
                Random random = new Random();
                int i = random.nextInt(diff + 1);
                i += min;
                textView1.setText(i);








            }
        };


    }
