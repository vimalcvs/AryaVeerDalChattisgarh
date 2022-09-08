package com.bindesh.aryaveerdalchattisgarh.yogacharaya;

import android.content.Intent;


import android.os.Bundle;

import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.Webview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Pranayam extends AppCompatActivity {
    public CardView cardView1,cardView8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pranayam);


        cardView1 = (CardView) findViewById(R.id.card1);
        cardView8 = (CardView) findViewById(R.id.card8);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pranayam.this, Webview.class);
                i.putExtra("keyHTML", "https://firebasestorage.googleapis.com/v0/b/programminglanguagesallprogram.appspot.com/o/VID-20180904-WA0020.mp4?alt=media&token=afc20b30-ee89-4817-942f-d3f26fbe52d8");
                String message = "Arya veer dal";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
    }
}
