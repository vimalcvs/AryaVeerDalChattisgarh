package com.bindesh.aryaveerdalchattisgarh.nyudhamacharya;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.musthi_pratyakaraman.Musthi_pratyakaraman_1;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.musthi_pratyakaraman.Musthi_pratyakaraman_2;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.musthi_pratyakaraman.Musthi_pratyakaraman_3;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.musthi_pratyakaraman.Musthi_pratyakaraman_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class Musthi_Pratyakaraman extends AppCompatActivity {
    public CardView cardView1, cardView2 , cardView3,cardView4;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musthi__pratyakaraman);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView4 = (CardView) findViewById(R.id.card4);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Musthi_Pratyakaraman.this, Musthi_pratyakaraman_1.class);
                startActivity(myIntent);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Musthi_Pratyakaraman.this, Musthi_pratyakaraman_2.class);
                startActivity(myIntent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Musthi_Pratyakaraman.this, Musthi_pratyakaraman_3.class);
                startActivity(myIntent);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Musthi_Pratyakaraman.this, Musthi_pratyakaraman_4.class);
                startActivity(myIntent);
            }
        });

    }
}
