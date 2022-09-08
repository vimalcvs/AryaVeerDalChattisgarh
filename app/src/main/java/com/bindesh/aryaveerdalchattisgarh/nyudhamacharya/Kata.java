package com.bindesh.aryaveerdalchattisgarh.nyudhamacharya;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;

import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.kata.Kata_1_upvyayamshikshak;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.kata.Kata_2_vyayamshikshak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Kata extends AppCompatActivity {

    public CardView cardView1, cardView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata);
        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Kata.this, Kata_1_upvyayamshikshak.class);
                startActivity(myIntent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Kata.this, Kata_2_vyayamshikshak.class);
                startActivity(myIntent);
            }
        });
    }
}
