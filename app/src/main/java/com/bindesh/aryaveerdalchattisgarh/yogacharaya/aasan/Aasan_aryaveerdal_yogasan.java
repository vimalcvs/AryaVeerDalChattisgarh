package com.bindesh.aryaveerdalchattisgarh.yogacharaya.aasan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.yogacharaya.aasan.aasan_aryaveerdal_yogasan.Yogasan_aryaveer_shreni;
import com.bindesh.aryaveerdalchattisgarh.yogacharaya.aasan.aasan_aryaveerdal_yogasan.Yogasan_sakhanayak_shreni;
import com.bindesh.aryaveerdalchattisgarh.yogacharaya.aasan.aasan_aryaveerdal_yogasan.Yogasan_vyayamshikshak_shreni;

public class Aasan_aryaveerdal_yogasan extends AppCompatActivity {
    public CardView cardView1, cardView2,cardView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aasan_aryaveerdal_yogasan);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aasan_aryaveerdal_yogasan.this, Yogasan_aryaveer_shreni.class);
                startActivity(myIntent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aasan_aryaveerdal_yogasan.this, Yogasan_sakhanayak_shreni.class);
                startActivity(myIntent);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aasan_aryaveerdal_yogasan.this, Yogasan_vyayamshikshak_shreni.class);
                startActivity(myIntent);
            }
        });
    }
}