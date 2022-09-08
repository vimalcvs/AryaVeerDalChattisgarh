package com.bindesh.aryaveerdalchattisgarh.sastracharya;

import android.content.Intent;


import android.os.Bundle;



import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;

import com.bindesh.aryaveerdalchattisgarh.sastracharya.bhala.Bhala_dutiyavarsh;
import com.bindesh.aryaveerdalchattisgarh.sastracharya.bhala.Bhala_prathamvarsh;
import com.bindesh.aryaveerdalchattisgarh.sastracharya.bhala.Bhala_sastracharya_1;
import com.bindesh.aryaveerdalchattisgarh.sastracharya.bhala.Bhala_upvyayam_shikshak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Bhala extends AppCompatActivity {

    public CardView cardView1, cardView2,cardView4, cardView3 ,cardView5,cardView6,cardView7 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhala);

        cardView1 = (CardView) findViewById(R.id.card1);

        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView4 = (CardView) findViewById(R.id.card4);
        cardView5 = (CardView) findViewById(R.id.card5);
        cardView6 = (CardView) findViewById(R.id.card6);
        cardView7 = (CardView) findViewById(R.id.card7);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Bhala.this, Bhala_prathamvarsh.class);
                startActivity(myIntent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Bhala.this, Bhala_dutiyavarsh.class);
                startActivity(myIntent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Bhala.this, Bhala_upvyayam_shikshak.class);
                startActivity(myIntent);


            }
        });
       /* cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Bhala.this, Bhala_vyayam_shikshak.class);
                startActivity(myIntent);


            }
        });*/
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Bhala.this, Bhala_sastracharya_1.class);
                startActivity(myIntent);


            }
        });
       /* cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Bhala.this, Bhala_sastracharya_2.class);
                startActivity(myIntent);


            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Bhala.this, Bhala_dwand.class);
                startActivity(myIntent);


            }
        });*/
    }
}
