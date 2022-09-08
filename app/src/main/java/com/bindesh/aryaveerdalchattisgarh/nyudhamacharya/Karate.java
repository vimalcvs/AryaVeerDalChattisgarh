package com.bindesh.aryaveerdalchattisgarh.nyudhamacharya;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.karate.Pratham_shreni;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.karate.Sakhanayak_shreni;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Karate extends AppCompatActivity {


    public CardView cardView1, cardView2 , cardView3, cardView4,cardView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karate);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView4 = (CardView) findViewById(R.id.card4);
        cardView5 = (CardView) findViewById(R.id.card5);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Karate.this, Pratham_shreni.class);
                startActivity(myIntent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Karate.this, Sakhanayak_shreni.class);
                startActivity(myIntent);
            }
        });
       /* cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Karate.this, Upvyayam_shikshak.class);
                startActivity(myIntent);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Karate.this, Vyayam_shikshak.class);
                startActivity(myIntent);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Karate.this, Self_defence.class);
                startActivity(myIntent);
            }
        });*/
    }
}
