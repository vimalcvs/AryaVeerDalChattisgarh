package com.bindesh.aryaveerdalchattisgarh.sastracharya;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.lathi.Lathi_Upvyayam_shikshak_shreni;
import com.bindesh.aryaveerdalchattisgarh.lathi.Lathi_dutiya_varsh;
import com.bindesh.aryaveerdalchattisgarh.lathi.Lathi_pratham_varsh;
import com.bindesh.aryaveerdalchattisgarh.lathi.Lathi_sastracharya_pratham_varsh;
import com.bindesh.aryaveerdalchattisgarh.lathi.Lathi_vyyayam_shikshak_shreni;

import com.bindesh.aryaveerdalchattisgarh.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Lathi extends AppCompatActivity {


    public CardView cardView1, cardView2,cardView3, cardView4,cardView5,cardView6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lathi);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView4 = (CardView) findViewById(R.id.card4);
        cardView5 = (CardView) findViewById(R.id.card5);
        cardView6 = (CardView) findViewById(R.id.card6);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Lathi.this, Lathi_pratham_varsh.class);
                startActivity(myIntent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Lathi.this, Lathi_dutiya_varsh.class);
                startActivity(myIntent);
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Lathi.this, Lathi_Upvyayam_shikshak_shreni.class);
                startActivity(myIntent);


            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Lathi.this, Lathi_vyyayam_shikshak_shreni.class);
                startActivity(myIntent);


            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Lathi.this, Lathi_sastracharya_pratham_varsh.class);
                startActivity(myIntent);


            }
        });
       /* cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Lathi.this, Lathi_sastracharya_dutiya_varsha.class);
                startActivity(myIntent);


            }
        });*/

    }
}
