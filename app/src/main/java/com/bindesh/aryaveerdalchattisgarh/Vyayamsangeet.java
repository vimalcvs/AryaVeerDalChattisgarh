package com.bindesh.aryaveerdalchattisgarh;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bindesh.aryaveerdalchattisgarh.vyayamsangeet.Anya_vyayam_sangeet;
import com.bindesh.aryaveerdalchattisgarh.vyayamsangeet.Aryaveerdal_Vyayam_Sangeet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Vyayamsangeet extends AppCompatActivity {

    public CardView cardView1, cardView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vyayamsangeet);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Vyayamsangeet.this, Aryaveerdal_Vyayam_Sangeet.class);
                startActivity(myIntent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Vyayamsangeet.this, Anya_vyayam_sangeet.class);
                Toast.makeText(Vyayamsangeet.this, "कार्य प्रगति पर है इस पेज का अपडेट जल्द ही आएगा ", Toast.LENGTH_SHORT).show();

                startActivity(myIntent);
            }
        });
    }
}
