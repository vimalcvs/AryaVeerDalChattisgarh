package com.bindesh.aryaveerdalchattisgarh.nyudhamacharya;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;

import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha.Suraksha_dutiyavarsh;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha.Suraksha_prathamvarsh;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha.Suraksha_upvyayamshikshak;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.suraksha.Suraksha_vyayamshikshak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Nyudhamacharya_Suraksha extends AppCompatActivity {

    public CardView cardView1, cardView2 , cardView3,cardView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nyudhamacharya__suraksha);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView4 = (CardView) findViewById(R.id.card4);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Nyudhamacharya_Suraksha.this, Suraksha_prathamvarsh.class);
                startActivity(myIntent);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Nyudhamacharya_Suraksha.this, Suraksha_dutiyavarsh.class);
                startActivity(myIntent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Nyudhamacharya_Suraksha.this, Suraksha_upvyayamshikshak.class);
                startActivity(myIntent);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Nyudhamacharya_Suraksha.this, Suraksha_vyayamshikshak.class);
                startActivity(myIntent);
            }
        });

    }

}
