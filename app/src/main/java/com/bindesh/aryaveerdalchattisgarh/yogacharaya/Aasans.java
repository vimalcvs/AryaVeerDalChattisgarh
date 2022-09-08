package com.bindesh.aryaveerdalchattisgarh.yogacharaya;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.yogacharaya.aasan.Aasan_anya_yogasan;
import com.bindesh.aryaveerdalchattisgarh.yogacharaya.aasan.Aasan_aryaveerdal_yogasan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Aasans extends AppCompatActivity {

    public CardView cardView1, cardView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aasans);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);

       /* cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aasans.this, Aasan_aryaveerdal_yogasan.class);
                startActivity(myIntent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Aasans.this, Aasan_anya_yogasan.class);
                startActivity(myIntent);
            }
        });*/
    }
}
