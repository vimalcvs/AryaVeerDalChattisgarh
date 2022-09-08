package com.bindesh.aryaveerdalchattisgarh.sastracharya;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.sastracharya.talvaar.Talvaar_sastracharya_1;
import com.bindesh.aryaveerdalchattisgarh.sastracharya.talvaar.Talvaar_sastracharya_2;
import com.bindesh.aryaveerdalchattisgarh.sastracharya.talvaar.Talvaar_upvyayam_shikshak;
import com.bindesh.aryaveerdalchattisgarh.sastracharya.talvaar.Talvaar_vyayam_shikshak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Taalvaar extends AppCompatActivity {


    public CardView cardView1, cardView2,cardView3, cardView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taalvaar);

        cardView1 = (CardView) findViewById(R.id.card1);

        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView4 = (CardView) findViewById(R.id.card4);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Taalvaar.this, Talvaar_upvyayam_shikshak.class);
                startActivity(myIntent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Taalvaar.this, Talvaar_vyayam_shikshak.class);
                startActivity(myIntent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Taalvaar.this, Talvaar_sastracharya_1.class);
                startActivity(myIntent);


            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Taalvaar.this, Talvaar_sastracharya_2.class);
                startActivity(myIntent);


            }
        });
    }
}
