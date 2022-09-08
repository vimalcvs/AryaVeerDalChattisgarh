package com.bindesh.aryaveerdalchattisgarh;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.pathyakaram.Astra;
import com.bindesh.aryaveerdalchattisgarh.pathyakaram.Pustakalaya;
import com.bindesh.aryaveerdalchattisgarh.pathyakaram.Ghosh;
import com.bindesh.aryaveerdalchattisgarh.pathyakaram.Nyudham;
import com.bindesh.aryaveerdalchattisgarh.pathyakaram.Sastra;
import com.bindesh.aryaveerdalchattisgarh.pathyakaram.Scouting;
import com.bindesh.aryaveerdalchattisgarh.pathyakaram.Vyayama;
import com.bindesh.aryaveerdalchattisgarh.pathyakaram.Yog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Pathyakaram extends AppCompatActivity {


    public CardView cardView1, cardView2 , cardView3, cardView4,cardView5,cardView6,cardView7,cardView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pathyakaram);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView4 = (CardView) findViewById(R.id.card4);
        cardView5 = (CardView) findViewById(R.id.card5);
        cardView6 = (CardView) findViewById(R.id.card6);
        cardView7 = (CardView) findViewById(R.id.card7);
        cardView8 = (CardView) findViewById(R.id.card8);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Pathyakaram.this, Vyayama.class);
                startActivity(myIntent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Pathyakaram.this, Sastra.class);
                startActivity(myIntent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Pathyakaram.this, Astra.class);
                startActivity(myIntent);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Pathyakaram.this, Nyudham.class);
                startActivity(myIntent);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Pathyakaram.this, Yog.class);
                startActivity(myIntent);
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Pathyakaram.this, Ghosh.class);
                startActivity(myIntent);
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Pathyakaram.this, Scouting.class);
                startActivity(myIntent);
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Pathyakaram.this, Pustakalaya.class);
                startActivity(myIntent);
            }
        });
    }
}
