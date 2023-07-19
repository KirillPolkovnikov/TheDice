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
    private ImageButton imageButton;
    private int textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = findViewById(R.id.imageButton);
        imageButton.setOnClickListener(listener);
        TextView textView1 = findViewById(R.id.textView);
                                                  }

        private View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int min = 1;
                int max = 6;
                int diff = max - min;
                Random random = new Random();
                int i = random.nextInt(diff + 1);
                i += min;
                textView = i;



            }
        };


    }
