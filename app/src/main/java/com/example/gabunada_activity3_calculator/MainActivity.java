package com.example.gabunada_activity3_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

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


    /**Parenthesis, Exponent and plus/Minus not added: not relevant**/
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

    ImageButton backspace;

    float num1,num2;

    boolean plus,minus,mult,div,dot,operand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display =(EditText) findViewById(R.id.display);

        one = (Button) findViewById(R.id.onebtn);
        one.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("SetTextI18n")
            public void onClick(View v){
                display.setText(display.getText() + "1");
            }
        });

        two = (Button) findViewById(R.id.twobtn);
        two.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "2");
            }
        });

        three = (Button) findViewById(R.id.threebtn);
        three.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "3");
            }
        });

        four = (Button) findViewById(R.id.fourbtn);
        four.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "4");
            }
        });

        five = (Button) findViewById(R.id.fivebtn);
        five.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "5");
            }
        });

        six = (Button) findViewById(R.id.sixbtn);
        six.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "6");
            }
        });

        seven = (Button) findViewById(R.id.sevenbtn);
        seven.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "7");
            }
        });

        eight = (Button) findViewById(R.id.eightbtn);
        eight.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "8");
            }
        });

        nine = (Button) findViewById(R.id.ninebtn);
        nine.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "9");
            }
        });

        zero = (Button) findViewById(R.id.zerobtn);
        zero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                display.setText(display.getText() + "0");
            }
        });

        point = (Button) findViewById(R.id.pointbtn);
        point.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(dot == false) {
                    display.setText(display.getText() + ".");
                    dot = true;
                }
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
            public void onClick(View v) {
                if(!plus) {
                    num1 = Float.parseFloat(display.getText() + "");
                    display.setText("");
                    plus = true;
                    operand = true;
                    dot = false;
                }
            }
        });

        subtract = (Button) findViewById(R.id.subtractbtn);
        subtract.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!minus) {
                    num1 = Float.parseFloat(display.getText() + "");
                    display.setText("");
                    minus = true;
                    operand = true;
                    dot = false;
                }
            }
        });

        multiply = (Button) findViewById(R.id.multiplybtn);
        multiply.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!mult) {
                    num1 = Float.parseFloat(display.getText() + "");
                    display.setText("");
                    mult = true;
                    operand = true;
                    dot = false;

                }
            }
        });
        divide = (Button) findViewById(R.id.dividebtn);
        divide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(!div) {
                    num1 = Float.parseFloat(display.getText() + "");
                    display.setText("");
                    div = true;
                    operand = true;
                    dot = false;
                }
            }
        });

        equals = (Button) findViewById(R.id.equalsbtn);
        equals.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if (operand) {
                    if (plus) {
                        num2 = Float.parseFloat(display.getText() + "");
                        num1 += num2;
                        display.setText(Float.toString(num1));
                        plus = false;
                    }else if(minus){
                        num2 = Float.parseFloat(display.getText() + "");
                        num1 -= num2;
                        display.setText(Float.toString(num1));
                        minus = false;

                    }else if(mult){
                        num2 = Float.parseFloat(display.getText() + "");
                        num1 *= num2;
                        display.setText(Float.toString(num1));
                        mult = false;

                    }else if(div){
                        num2 = Float.parseFloat(display.getText() + "");
                        num1 /= num2;
                        display.setText(Float.toString(num1));
                        div = false;

                    }
                    operand = false;

                }
            }
        });

        backspace = (ImageButton) findViewById(R.id.backspacebtn);
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = display.getText().toString();


                int index = str.length() - 1;
                char period = str.charAt(index);
                if(period == '.'){
                    dot = false;
                }
                if (str.length() >= 1) {
                    str = str.substring(0, str.length() - 1);
                    display.setText(str);
                } else if (str.length() < 1) {
                    display.setText("");
                }
            }
        });

    }

}