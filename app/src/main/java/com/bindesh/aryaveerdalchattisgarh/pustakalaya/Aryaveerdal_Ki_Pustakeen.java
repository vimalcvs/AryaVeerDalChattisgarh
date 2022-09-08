package com.bindesh.aryaveerdalchattisgarh.pustakalaya;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.Webview;



import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Aryaveerdal_Ki_Pustakeen extends AppCompatActivity {


    public CardView cardView1, cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8,cardView9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aryaveerdal_ki_pustakeen);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
        cardView4 = (CardView) findViewById(R.id.card4);
        cardView5 = (CardView) findViewById(R.id.card5);
        cardView6 = (CardView) findViewById(R.id.card6);
        cardView7 = (CardView) findViewById(R.id.card7);
        cardView8 = (CardView) findViewById(R.id.card8);
        cardView9 = (CardView) findViewById(R.id.card9);




        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Ki_Pustakeen.this, Webview.class);
                i.putExtra("keyHTML", "https://drive.google.com/file/d/1QahRCIhV29tChAr7FK5qKwdnf2mibAup/view?usp=sharing");
                String message = "प्रथम द्वितीय वर्ष";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Ki_Pustakeen.this, Webview.class);
                i.putExtra("keyHTML", "https://drive.google.com/file/d/114RdGCmwYIcIGWe4vSGDY5eliwDoChDQ/view?usp=sharing");
                String message = "उप व्यायाम और व्यायाम शिक्षक श्रेणी";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        /*cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Ki_Pustakeen.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/pdf/praharinirkishak_gate.pdf");
                String message = "उप व्यायाम और व्यायाम शिक्षक श्रेणी";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Ki_Pustakeen.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/pdf/praharinirkishak_gate.pdf");
                String message = "उप व्यायाम और व्यायाम शिक्षक श्रेणी";
                i.putExtra("key", message);
                startActivity(i);

            }
        });*/
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Ki_Pustakeen.this, Webview.class);
                i.putExtra("keyHTML", "https://aryaveerdal.in/html/question.html");
                String message = "उप व्यायाम और व्यायाम शिक्षक श्रेणी";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Ki_Pustakeen.this, Webview.class);
                i.putExtra("keyHTML", "https://drive.google.com/file/d/13KB-w8lgJiOiky04Nvx-vpLI45tW7ZBK/view?usp=sharing");
                String message = "व्यक्तित्व विकास ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Ki_Pustakeen.this, Webview.class);
                i.putExtra("keyHTML", "https://drive.google.com/file/d/1ZztpAJw8M87_eDNLDu3g55DvGrpg7auT/view?usp=sharing");
                String message = "नियुद्धम";
                i.putExtra("key", message);
                startActivity(i);

            }
        });/*
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Ki_Pustakeen.this, Webview.class);
                i.putExtra("keyHTML", "https://aryaveerdal.in/html/question.html");
                String message = "उप व्यायाम और व्यायाम शिक्षक श्रेणी";
                i.putExtra("key", message);
                startActivity(i);

            }
        });*/
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Ki_Pustakeen.this, Webview.class);
                i.putExtra("keyHTML", "https://aryaveerdal.in/html/arya.html");
                String message = "उप व्यायाम और व्यायाम शिक्षक श्रेणी";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
    }
}
