package com.example.gabunada_activity3_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText display;

    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;

    Button clear;
    Button parenthesis;
    Button exponent;
    Button add;
    Button subtract;
    Button multiply;
    Button divide;
    Button equals;
    Button point;
    Button plusMinus;

    Button backspace;

    boolean plus,minus,mult,div;
    String first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display =(EditText) findViewById(R.id.display);

        one = (Button) findViewById(R.id.onebtn);
        one.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            public void onClick(View v){
                String a;
                a = display.getText().toString();
                display.setText(a + "1");
            }
        });

        two = (Button) findViewById(R.id.twobtn);
        two.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String a;
                a = display.getText().toString();
                display.setText(a + "2");
            }
        });

        three = (Button) findViewById(R.id.threebtn);
        three.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String a;
                a = display.getText().toString();
                display.setText(a + "3");
            }
        });

        four = (Button) findViewById(R.id.fourbtn);
        four.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String a;
                a = display.getText().toString();
                display.setText(a + "4");
            }
        });

        five = (Button) findViewById(R.id.fivebtn);
        five.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String a;
                a = display.getText().toString();
                display.setText(a + "5");
            }
        });

        six = (Button) findViewById(R.id.sixbtn);
        six.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String a;
                a = display.getText().toString();
                display.setText(a + "6");
            }
        });

        seven = (Button) findViewById(R.id.sevenbtn);
        seven.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String a;
                a = display.getText().toString();
                display.setText(a + "7");
            }
        });

        eight = (Button) findViewById(R.id.eightbtn);
        eight.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String a;
                a = display.getText().toString();
                display.setText(a + "8");
            }
        });

        nine = (Button) findViewById(R.id.ninebtn);
        nine.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String a;
                a = display.getText().toString();
                display.setText(a + "9");
            }
        });

        zero = (Button) findViewById(R.id.zerobtn);
        zero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String a;
                a = display.getText().toString();
                display.setText(a + "0");
            }
        });


        clear = (Button) findViewById(R.id.clearbtn);
        clear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText("");
            }
        });

        add = (Button) findViewById(R.id.addbtn);
        add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(plus || minus || mult || div){
                    display.setText("");
                    plus = false;
                    minus = false;
                    mult = false;
                    div = false;
                }
                first = display.getText().toString();
                plus = true;
            }
        });

    }

}