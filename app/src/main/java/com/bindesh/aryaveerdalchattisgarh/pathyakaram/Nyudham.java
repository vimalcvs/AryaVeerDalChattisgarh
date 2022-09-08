package com.bindesh.aryaveerdalchattisgarh.pathyakaram;

import android.content.Intent;


import android.os.Bundle;
import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.Karate;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.Kata;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.Kick_suraksha;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.Musthi_Pratyakaraman;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.Nyudhamacharya_Suraksha;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.Padaghaat;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.Aatma_rakshavigyan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Nyudham extends AppCompatActivity {


    public CardView cardView1, cardView2 , cardView3, cardView4,cardView5,cardView6,cardView7,cardView8,cardView9,cardView10,cardView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nyudhammacharya);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView4 = (CardView) findViewById(R.id.card4);
        cardView5 = (CardView) findViewById(R.id.card5);
        cardView6 = (CardView) findViewById(R.id.card6);
        cardView7 = (CardView) findViewById(R.id.card7);
        cardView8 = (CardView) findViewById(R.id.card8);
        cardView9 = (CardView) findViewById(R.id.card9);
        cardView10 = (CardView) findViewById(R.id.card10);
        cardView11 = (CardView) findViewById(R.id.card11);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Nyudham.this, Karate.class);
                startActivity(myIntent);
            }
        });

       /* cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Nyudham.this, Kalari.class);
                startActivity(myIntent);
            }
        });*/
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Nyudham.this, Kata.class);
                startActivity(myIntent);
            }
        });
       /* cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Nyudham.this, Chaku_se_bachaw.class);
                startActivity(myIntent);
            }
        });*/
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Nyudham.this, Aatma_rakshavigyan.class);
                startActivity(myIntent);
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Nyudham.this, Kick_suraksha.class);
                startActivity(myIntent);
            }
        });
       /* cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Nyudham.this, Counter_attack.class);
                startActivity(myIntent);
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Nyudham.this, Hathiyaron_se_suraksha.class);
                startActivity(myIntent);
            }
        });*/
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Nyudham.this, Musthi_Pratyakaraman.class);
                startActivity(myIntent);
            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Nyudham.this, Padaghaat.class);
                startActivity(myIntent);
            }
        });

        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Nyudham.this, Nyudhamacharya_Suraksha.class);
                startActivity(myIntent);
            }
        });

    }
}
