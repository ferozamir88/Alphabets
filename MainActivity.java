package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ArgbEvaluator;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView, textView2, textView4;
    private Button button, button2, button3;



    int i, count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);



        nextLetter();

    }
    public void nextLetter()
    {
        double d = ((Math.random()*1000)%26) + 97;
        i = (int)d;
        char text = (char)i;
        String s = "" + text;
        textView4.setText("Score " + count);
        textView.setText(s);

    }

    public void checkSkyLetter(View view)
    {
        if (i == 98 || i == 100|| i == 102 || i == 104 || i == 107 || i == 108 || i == 116)
        {
            textView2.setTextColor(0xFF42B322);
            textView2.setText("True");
            count++;
            textView4.setText("Score " + count);

        }
        else
        {
            textView2.setTextColor(0xFFBD1919);
            textView2.setText("False");

        }
        nextLetter();
    }
    public void checkGrassLetter(View view)
    {
        if(i == 97 || i == 99 || i == 101 || i == 105 || i == 109 || i == 110 || i == 111 || i == 114 || i == 115 || i == 117 || i == 118 || i == 119 || i == 120)
        {
            textView2.setTextColor(0xFF42B322);
            textView2.setText("True");
            count++;
            textView4.setText("Score " + count);

        }
        else
        {
            textView2.setTextColor(0xFFBD1919);
            textView2.setText("False");

        }
        nextLetter();
    }
    public void checkRootLetter(View view)
    {
        if (i == 103 || i == 106|| i == 112 || i == 113 || i == 121 || i == 122)
        {
            textView2.setTextColor(0xFF42B322);
            textView2.setText("True");
            count++;
            textView4.setText("Score " + count);

        }
        else
        {
            textView2.setTextColor(0xFFBD1919);
            textView2.setText("False");

        }
        nextLetter();
    }


}