package com.bindesh.aryaveerdalchattisgarh.nyudhamacharya;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_10;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_11;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_12;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_13;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_14;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_15;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_16;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_17;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_18;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_19;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_2;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_1;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_20;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_21;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_3;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_4;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_5;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_6;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_7;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_9;
import com.bindesh.aryaveerdalchattisgarh.nyudhamacharya.aatma_raksha_vigyan.Self_defence_8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Aatma_rakshavigyan extends AppCompatActivity {
    public CardView cardView1, cardView2 , cardView3,cardView4 ,cardView5,cardView6,cardView7, cardView8 ,cardView9,cardView10,cardView11,cardView12,cardView13,cardView14,cardView15,cardView16,cardView17,cardView18,cardView19,cardView20,cardView21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aatma_rakshavigyan);

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
        cardView15 = (CardView) findViewById(R.id.card15);
        cardView16 = (CardView) findViewById(R.id.card16);

        cardView17 = (CardView) findViewById(R.id.card17);
        cardView18 = (CardView) findViewById(R.id.card18);
        cardView19 = (CardView) findViewById(R.id.card19);
        cardView20 = (CardView) findViewById(R.id.card20);

        cardView21 = (CardView) findViewById(R.id.card21);


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_1.class);
                startActivity(myIntent);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_2.class);
                startActivity(myIntent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_3.class);
                startActivity(myIntent);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_4.class);
                startActivity(myIntent);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_5.class);
                startActivity(myIntent);
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_6.class);
                startActivity(myIntent);
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_7.class);
                startActivity(myIntent);
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_8.class);
                startActivity(myIntent);
            }
        });
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_9.class);
                startActivity(myIntent);
            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_10.class);
                startActivity(myIntent);
            }
        });
        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_11.class);
                startActivity(myIntent);
            }
        });
        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_12.class);
                startActivity(myIntent);
            }
        });
        cardView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_13.class);
                startActivity(myIntent);
            }
        });
        cardView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_14.class);
                startActivity(myIntent);
            }
        });
        cardView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_15.class);
                startActivity(myIntent);
            }
        });
        cardView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_16.class);
                startActivity(myIntent);
            }
        });
        cardView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_17.class);
                startActivity(myIntent);
            }
        });
        cardView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_18.class);
                startActivity(myIntent);
            }
        });
        cardView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_19.class);
                startActivity(myIntent);
            }
        });
        cardView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_20.class);
                startActivity(myIntent);
            }
        });
        cardView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aatma_rakshavigyan.this, Self_defence_21.class);
                startActivity(myIntent);
            }
        });
    }
}
