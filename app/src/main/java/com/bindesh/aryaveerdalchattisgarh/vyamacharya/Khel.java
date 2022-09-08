package com.bindesh.aryaveerdalchattisgarh.vyamacharya;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;


import com.bindesh.aryaveerdalchattisgarh.R;

import com.bindesh.aryaveerdalchattisgarh.vyamacharya.khel.Khel_1;
import com.bindesh.aryaveerdalchattisgarh.vyamacharya.khel.Khel_2;
import com.bindesh.aryaveerdalchattisgarh.vyamacharya.khel.Khel_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Khel extends AppCompatActivity {
    public CardView cardView1, cardView2, cardView3, cardView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khel);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView4 = (CardView) findViewById(R.id.card4);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Khel.this, Khel_1.class);
                startActivity(myIntent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Khel.this, Khel_2.class);
                startActivity(myIntent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Khel.this, Khel_3.class);
                startActivity(myIntent);


            }
        });


    }
}
