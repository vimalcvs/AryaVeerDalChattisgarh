package com.bindesh.aryaveerdalchattisgarh.pathyakaram;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.ghosh.Vanshi_Rachna;
import com.bindesh.aryaveerdalchattisgarh.vyamacharya.Dumble;
import com.bindesh.aryaveerdalchattisgarh.vyamacharya.Surya_namaskar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Ghosh extends AppCompatActivity {


    public CardView cardView1,cardView2,cardView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghosh);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Ghosh.this,Vanshi_Rachna.class);
                startActivity(myIntent);
            }
        });
     /*   cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Ghosh.this,Dumble.class);
                startActivity(myIntent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Ghosh.this,Surya_namaskar.class);
                startActivity(myIntent);
            }
        });*/


    }
}
