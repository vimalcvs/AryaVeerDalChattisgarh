package com.bindesh.aryaveerdalchattisgarh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Arya_Samaj extends AppCompatActivity {

    public CardView cardView10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arya__samaj);

        cardView10 = (CardView) findViewById(R.id.card10);

        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Arya_Samaj.this, Webview.class);
                i.putExtra("keyHTML", "https://elibrary.thearyasamaj.org/");
                String message = "ई पुस्तकालय  ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
    }
}