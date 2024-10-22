package com.packages.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    protected Button one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,multiple,division,percentage,equal,clear;
    protected long calculation =0,temp =0, left =1,right =1;
    protected TextView calculationtv;
    protected  char  operand;
    protected boolean side = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        plus = findViewById(R.id.add);
        minus = findViewById(R.id.subtract);
        multiple = findViewById(R.id.multiply);
        division = findViewById(R.id.divide);
        percentage = findViewById(R.id.percentage);
        equal = findViewById(R.id.equal);
        clear = findViewById(R.id.cleartxt);
        calculationtv = findViewById(R.id.calculationtext);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp == 0)
                temp +=1;
                else temp = (temp *10) + 1;
                calculationtv.setText(Long.toString(temp));
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp == 0)
                    temp +=2;
                else temp = (temp *10) +2;
                calculationtv.setText(Long.toString(temp));
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp == 0)
                    temp +=3;
                else temp = (temp *10) +3;
                calculationtv.setText(Long.toString(temp));
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp == 0)
                    temp +=4;
                else temp = (temp *10) +4;
                calculationtv.setText(Long.toString(temp));
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp == 0)
                    temp +=5;
                else temp = (temp *10) +5;
                calculationtv.setText(Long.toString(temp));
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp == 0)
                    temp +=6;
                else temp = (temp *10) +6;
                calculationtv.setText(Long.toString(temp));
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp == 0)
                    temp +=7;
                else temp = (temp *10) +7;
                calculationtv.setText(Long.toString(temp));
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp == 0)
                    temp +=8;
                else temp = (temp *10) +8;
                calculationtv.setText(Long.toString(temp));
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp == 0)
                    temp +=9;
                else temp = (temp *10) +9;
                calculationtv.setText(Long.toString(temp));
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(temp == 0)
                    temp +=0;
                else temp = (temp *10) +0;
                calculationtv.setText(Long.toString(temp));
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(side){
                    left = temp;
                    side = false;
                    temp =0L;
                }
                else right = temp;
                operand = '+';
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(side){
                    left = temp;
                    side = false;
                }
                else right = temp;
                operand = '-';
            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(side){
                    left = temp;
                    side = false;
                }
                else right = temp;
                operand = '*';
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(side){
                    left = 0;
                    temp = 0;
                }
                else {
                    right = 0;
                    temp = 0;
                    side = true;
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculationtv.setText(calculate(left,right,operand));
            }
        });

    }
    protected  String calculate (long left, long right, char operand){
        switch (operand){
            case '+': calculation = left + right;
                        break;
            case '-': calculation = left - right;
                        break;
            case '*': calculation = left * right;
                        break;
        }
        return Long.toString(calculation);
    }
}