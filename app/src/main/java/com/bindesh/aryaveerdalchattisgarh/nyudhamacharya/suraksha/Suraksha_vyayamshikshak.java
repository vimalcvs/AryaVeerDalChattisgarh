package com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;

import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha.suraksha_vyayamshikshak_shreni.Suraksha_vyayamshikshak_1;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha.suraksha_vyayamshikshak_shreni.Suraksha_vyayamshikshak_2;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha.suraksha_vyayamshikshak_shreni.Suraksha_vyayamshikshak_3;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha.suraksha_vyayamshikshak_shreni.Suraksha_vyayamshikshak_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Suraksha_vyayamshikshak extends AppCompatActivity {

    public CardView cardView1, cardView2 , cardView3,cardView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suraksha_vyayamshikshak);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView4 = (CardView) findViewById(R.id.card4);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Suraksha_vyayamshikshak.this, Suraksha_vyayamshikshak_1.class);
                startActivity(myIntent);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Suraksha_vyayamshikshak.this, Suraksha_vyayamshikshak_2.class);
                startActivity(myIntent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Suraksha_vyayamshikshak.this, Suraksha_vyayamshikshak_3.class);
                startActivity(myIntent);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Suraksha_vyayamshikshak.this, Suraksha_vyayamshikshak_4.class);
                startActivity(myIntent);
            }
        });

    }
}
