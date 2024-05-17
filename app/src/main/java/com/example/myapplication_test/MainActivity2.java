package com.example.myapplication_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity2 extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGHT = 3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent mainIntent = new Intent(MainActivity2.this, MainActivity.class);
                MainActivity2.this.startActivity(mainIntent);
                MainActivity2.this.finish();
            }
        }, SPLASH_DISPLAY_LENGHT);
    }
}