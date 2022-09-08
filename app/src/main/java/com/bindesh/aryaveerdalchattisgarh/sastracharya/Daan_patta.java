package com.bindesh.aryaveerdalchattisgarh.sastracharya;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;


import com.bindesh.aryaveerdalchattisgarh.sastracharya.daan_patta.Kolhapuri;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Daan_patta extends AppCompatActivity {

    public CardView cardView1, cardView2,cardView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daan_patta);


        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Daan_patta.this, Kolhapuri.class);
                startActivity(myIntent);
            }
        });

      /*  cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Daan_patta.this, Aamrawati.class);
                startActivity(myIntent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Daan_patta.this, Baroda.class);
                startActivity(myIntent);


            }
        });*/
    }
}
