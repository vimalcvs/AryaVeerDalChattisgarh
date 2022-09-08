package com.bindesh.aryaveerdalchattisgarh.pathyakaram;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.yogacharaya.Aasans;
import com.bindesh.aryaveerdalchattisgarh.yogacharaya.Bandh;
import com.bindesh.aryaveerdalchattisgarh.yogacharaya.Pranayam;
import com.bindesh.aryaveerdalchattisgarh.yogacharaya.Suddhi_kriya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Yog extends AppCompatActivity {

    public CardView cardView6,cardView8,cardView7,cardView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yog);

        cardView4 = (CardView) findViewById(R.id.card4);
        cardView7 = (CardView) findViewById(R.id.card7);
        cardView6 = (CardView) findViewById(R.id.card6);
        cardView8 = (CardView) findViewById(R.id.card8);



        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Yog.this,Bandh.class);
                startActivity(myIntent);
            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Yog.this,Aasans.class);
                startActivity(myIntent);
            }
        });

        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Yog.this, Suddhi_kriya.class);
                startActivity(myIntent);
            }
        });

        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Yog.this,Pranayam.class);
                startActivity(myIntent);
            }
        });


    }
}
