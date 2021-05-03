package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.zip.DeflaterInputStream;

public class MainActivity extends AppCompatActivity {

    double num1, num2;

    boolean Add, Multiply, Divide, Minus, ac, deci = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button_mul;

        TextView textView = findViewById(R.id.textView2);

        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);
        Button zero = findViewById(R.id.zero);
        Button dot = findViewById(R.id.dot);
        Button multiply = findViewById(R.id.times);
//        button_mul = (Button) findViewById(R.id.times);
        Button divide = findViewById(R.id.divide);
        Button add = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button percentage = findViewById(R.id.percentage);
        Button AC = findViewById(R.id.AC);
        Button equal = findViewById(R.id.equal);
        Button negative = findViewById(R.id.negative);


        one.setOnClickListener(v -> {
            textView.setText(textView.getText() + "1");
        });

        two.setOnClickListener(v -> {
            textView.setText(textView.getText() + "2");
        });

        three.setOnClickListener(v -> {
            textView.setText(textView.getText() + "3");
        });

        four.setOnClickListener(v -> {
            textView.setText(textView.getText() + "4");
        });

        five.setOnClickListener(v -> {
            textView.setText(textView.getText() + "5");
        });

        six.setOnClickListener(v -> {
            textView.setText(textView.getText() + "6");
        });

        seven.setOnClickListener(v -> {
            textView.setText(textView.getText() + "7");
        });

        eight.setOnClickListener(v -> {
            textView.setText(textView.getText() + "8");
        });

        nine.setOnClickListener(v -> {
            textView.setText(textView.getText() + "9");
        });

        zero.setOnClickListener(v -> {
            textView.setText(textView.getText() + "0");
        });

        dot.setOnClickListener(v -> {
            textView.setText(textView.getText() + ".");
        });

        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(null);
                num1 = 0;
                num2 = 0;
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().length() != 0) {
                    num1 = Float.parseFloat(textView.getText() + "");
                    Multiply = true;
                    deci = false;
                    textView.setText(null);
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().length() != 0) {
                    num1 = Float.parseFloat(textView.getText() + "");
                    Add = true;
                    deci = false;
                    textView.setText(null);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().length() != 0) {
                    num1 = Float.parseFloat(textView.getText() + "");
                    Minus = true;
                    deci = false;
                    textView.setText(null);
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().length() != 0 ) {
                    num1 = Float.parseFloat(textView.getText() + "");
                    Divide = true;
                    deci = false;
                    textView.setText(null);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Add || Minus || Multiply || Divide) {
                    num2 = Float.parseFloat(textView.getText() + "");
                }
                    if (Add) {
                        textView.setText(num1 + num2 + "");
                        Add = false;
                    }

                    if (Minus) {
                        textView.setText(num1 - num2 + "");
                        Minus = false;
                    }

                    if (Multiply) {
                        textView.setText(num1 * num2 + "");
                        Multiply = false;
                    }

                    if (Divide) {
                        textView.setText(num1 / num2 + "");
                        Divide = false;
                    }

            }
        });
    }
}