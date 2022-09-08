package com.bindesh.aryaveerdalchattisgarh.nyudhamacharya;

import android.content.Intent;


import android.os.Bundle;
import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;

import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.padaghat.Padaghat_dutiya_varsh;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.padaghat.Padaghat_pratham_varsh;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.padaghat.Padaghat_upvyayam_shikshak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Padaghaat extends AppCompatActivity {
    public CardView cardView1, cardView2 , cardView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padaghaat);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Padaghaat.this, Padaghat_pratham_varsh.class);
                startActivity(myIntent);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Padaghaat.this, Padaghat_dutiya_varsh.class);
                startActivity(myIntent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Padaghaat.this, Padaghat_upvyayam_shikshak.class);
                startActivity(myIntent);
            }
        });
    }
}
