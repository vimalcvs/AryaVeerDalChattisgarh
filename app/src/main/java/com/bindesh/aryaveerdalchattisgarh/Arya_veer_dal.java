package com.bindesh.aryaveerdalchattisgarh;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bindesh.aryaveerdalchattisgarh.aryaveerdal.Arya_veerdal_social_pages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class Arya_veer_dal extends AppCompatActivity {
    public CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arya_veer_dal);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView4 = (CardView) findViewById(R.id.card4);
        cardView5 = (CardView) findViewById(R.id.card5);
        cardView6 = (CardView) findViewById(R.id.card6);

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Arya_veer_dal.this, Arya_veerdal_social_pages.class);

                startActivity(myIntent);
            }
        });



    }
}