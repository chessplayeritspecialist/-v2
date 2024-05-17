package com.example.myapplication_test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static TextView text_number;
    static TextView text_number_2;
    static TextView text_number_3;

    static char p;


    static StringBuilder text = new StringBuilder();

    public static int number_1;
    public static int number_2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_number = findViewById(R.id.text_number);
        text_number_2 = findViewById(R.id.text_number_2);
        text_number_3 = findViewById(R.id.text_number_3);

        getSupportActionBar().hide();
    }




    public static void Proverka()
    {

        switch (p)
        {
            case '+':
            {
                text_number_3.setText("+");
                break;
            }
            case '-':
            {
                text_number_3.setText("-");
                break;
            }
            case 'y':
            {
                text_number_3.setText("x");
                break;
            }
            case 'd':
            {
                text_number_3.setText(":");
                break;
            }
        }

        text_number_2.setText(text_number.getText());
    }

    public static void Proverka_2()
    {
        number_1 = Integer.parseInt ((String) text_number_2.getText());
        number_2 = Integer.parseInt ((String) text_number.getText());


        switch (p)
        {


            case '+':
            {
                number_1+=number_2;
                text_number.setText(String.valueOf(number_1));
                break;
            }
            case '-':
            {
                number_1-=number_2;
                text_number.setText(String.valueOf(number_1));
                break;
            }
            case 'y':
            {
                number_1*=number_2;
                text_number.setText(String.valueOf(number_1));
                break;
            }

        }

    }

    public static void clear_text()
    {

         text.delete(0, text.length());
    }


    public void click_1(View view) {
        text_number.setText(text.append(1));
    }

    public void click_2(View view) {
        text_number.setText(text.append(2));
    }

    public void click_3(View view) {
        text_number.setText(text.append(3));
    }

    public void click_plus(View view) {
        p = '+';
        Proverka();
        text_number.setText("");
        clear_text();
    }

    public void click_4(View view) {
        text_number.setText(text.append(4));
    }

    public void click_5(View view) {
        text_number.setText(text.append(5));
    }

    public void click_6(View view) {
        text_number.setText(text.append(6));
    }

    public void click_minus(View view) {
        p = '-';
        Proverka();
        text_number.setText("");
        clear_text();
    }

    public void click_7(View view) {
        text_number.setText(text.append(7));
    }

    public void click_8(View view) {
        text_number.setText(text.append(8));
    }

    public void click_9(View view) {
        text_number.setText(text.append(9));
    }

    public void click_x(View view) {
        p = 'y';
        Proverka();
        text_number.setText("");
        clear_text();
    }


    public void click_r(View view) {

        Proverka_2();


    }

    public void click_0(View view) {
        text_number.setText(text.append(0));
    }

    public void click_c(View view) {
        clear_text();
        text_number.setText(text);
        text_number_2.setText(text);
        text_number_3.setText(text);

    }

    public void click_delenie(View view) {
        p = 'd';
        Proverka();
        text_number.setText("");
        clear_text();

    }
}