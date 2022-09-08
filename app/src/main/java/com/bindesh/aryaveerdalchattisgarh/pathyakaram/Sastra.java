package com.bindesh.aryaveerdalchattisgarh.pathyakaram;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;


import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.sastracharya.Bhala;
import com.bindesh.aryaveerdalchattisgarh.sastracharya.Daan_patta;
import com.bindesh.aryaveerdalchattisgarh.sastracharya.Jambiya_1;
import com.bindesh.aryaveerdalchattisgarh.sastracharya.Lathi;
import com.bindesh.aryaveerdalchattisgarh.sastracharya.Mandu;
import com.bindesh.aryaveerdalchattisgarh.sastracharya.Parshu;
import com.bindesh.aryaveerdalchattisgarh.sastracharya.Taalvaar;
import com.bindesh.aryaveerdalchattisgarh.sastracharya.Yavara_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Sastra extends AppCompatActivity {


    public CardView cardView1, cardView2 , cardView3, cardView4,cardView5,cardView6,cardView7,cardView8,cardView9,cardView10,cardView11,cardView12,cardView13,cardView14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sastra);




        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView4 = (CardView) findViewById(R.id.card4);
        cardView5 = (CardView) findViewById(R.id.card5);
        cardView6 = (CardView) findViewById(R.id.card6);
        cardView7 = (CardView) findViewById(R.id.card7);
        cardView8 = (CardView) findViewById(R.id.card8);
        cardView9 = (CardView) findViewById(R.id.card9);
        cardView10 = (CardView) findViewById(R.id.card10);
        cardView11 = (CardView) findViewById(R.id.card11);
        cardView12 = (CardView) findViewById(R.id.card12);
        cardView13 = (CardView) findViewById(R.id.card13);
        cardView14 = (CardView) findViewById(R.id.card14);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Sastra.this,Lathi.class);
                startActivity(myIntent);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Sastra.this,Parshu.class);
                startActivity(myIntent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Sastra.this,Bhala.class);
                startActivity(myIntent);
            }
        });
       /* cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Sastra.this, Naan_Chaku.class);
                startActivity(myIntent);
            }
        });*/
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Sastra.this,Taalvaar.class);
                startActivity(myIntent);
            }
        });
       /* cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Sastra.this,Yavara.class);
                startActivity(myIntent);
            }
        });*/


        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Sastra.this, Yavara_1.class);
                startActivity(myIntent);
            }
        });
       /* cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Sastra.this, Sitara.class);
                startActivity(myIntent);
            }
        });*/
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Sastra.this, Jambiya_1.class);
                startActivity(myIntent);
            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Sastra.this,Mandu.class);
                startActivity(myIntent);
            }
        });
        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Sastra.this, Daan_patta.class);
                startActivity(myIntent);
            }
        });
       /* cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Sastra.this, Bagnakha.class);
                startActivity(myIntent);
            }
        });

        cardView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Sastra.this, Gadka.class);
                startActivity(myIntent);
            }
        });
        cardView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Sastra.this, Gadaa.class);
                startActivity(myIntent);
            }
        });*/
    }
}
