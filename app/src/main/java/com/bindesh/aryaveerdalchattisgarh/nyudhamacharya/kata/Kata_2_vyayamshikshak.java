package com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.kata;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.kata.kata2.Kata2_1;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.kata.kata2.Kata2_10;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.kata.kata2.Kata2_2;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.kata.kata2.Kata2_3;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.kata.kata2.Kata2_4;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.kata.kata2.Kata2_5;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.kata.kata2.Kata2_6;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.kata.kata2.Kata2_7;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.kata.kata2.Kata2_8;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.kata.kata2.Kata2_9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class Kata_2_vyayamshikshak extends AppCompatActivity {


    public CardView cardView1, cardView2,  cardView3, cardView4,cardView5,cardView6,cardView7,cardView8,cardView9,cardView10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kata_2_vyayamshikshak);


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

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Kata_2_vyayamshikshak.this, Kata2_1.class);
                startActivity(myIntent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Kata_2_vyayamshikshak.this, Kata2_2.class);
                startActivity(myIntent);
            }
        });
       cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Kata_2_vyayamshikshak.this, Kata2_3.class);
                startActivity(myIntent);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Kata_2_vyayamshikshak.this, Kata2_4.class);
                startActivity(myIntent);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Kata_2_vyayamshikshak.this, Kata2_5.class);
                startActivity(myIntent);
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Kata_2_vyayamshikshak.this, Kata2_6.class);
                startActivity(myIntent);
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Kata_2_vyayamshikshak.this, Kata2_7.class);
                startActivity(myIntent);
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Kata_2_vyayamshikshak.this, Kata2_8.class);
                startActivity(myIntent);
            }
        });
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Kata_2_vyayamshikshak.this, Kata2_9.class);
                startActivity(myIntent);
            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Kata_2_vyayamshikshak.this, Kata2_10.class);
                startActivity(myIntent);
            }
        });
    }
}
