package com.bindesh.aryaveerdalchattisgarh;

import android.content.Intent;

import android.os.CountDownTimer;


import android.os.Bundle;
import android.view.View;

import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_Screen extends AppCompatActivity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);

        new CountDownTimer(Config.SPLASH_TIME, 900) {

            @Override
            public void onFinish() {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
                finish();

                progressBar.setVisibility(View.GONE);

            }

            @Override
            public void onTick(long millisUntilFinished) {

            }
        }.start();

    }
}
