package com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha.suraksha_dutiyavarsh.Suraksha_dutiyavarsh_1;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha.suraksha_dutiyavarsh.Suraksha_dutiyavarsh_2;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha.suraksha_dutiyavarsh.Suraksha_dutiyavarsh_3;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha.suraksha_dutiyavarsh.Suraksha_dutiyavarsh_4;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha.suraksha_dutiyavarsh.Suraksha_dutiyavarsh_5;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha.suraksha_dutiyavarsh.Suraksha_dutiyavarsh_6;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha.suraksha_dutiyavarsh.Suraksha_dutiyavarsh_7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Suraksha_dutiyavarsh extends AppCompatActivity {

    public CardView cardView1, cardView2 , cardView3,cardView4,cardView5,cardView6,cardView7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suraksha_dutiyavarsh);


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
                Intent myIntent = new Intent(Suraksha_dutiyavarsh.this, Suraksha_dutiyavarsh_1.class);
                startActivity(myIntent);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Suraksha_dutiyavarsh.this, Suraksha_dutiyavarsh_2.class);
                startActivity(myIntent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Suraksha_dutiyavarsh.this, Suraksha_dutiyavarsh_3.class);
                startActivity(myIntent);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Suraksha_dutiyavarsh.this, Suraksha_dutiyavarsh_4.class);
                startActivity(myIntent);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Suraksha_dutiyavarsh.this, Suraksha_dutiyavarsh_5.class);
                startActivity(myIntent);
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Suraksha_dutiyavarsh.this, Suraksha_dutiyavarsh_6.class);
                startActivity(myIntent);
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Suraksha_dutiyavarsh.this, Suraksha_dutiyavarsh_7.class);
                startActivity(myIntent);
            }
        });

    }
}
