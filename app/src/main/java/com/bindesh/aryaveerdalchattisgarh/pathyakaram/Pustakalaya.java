package com.bindesh.aryaveerdalchattisgarh.pathyakaram;

import android.content.Intent;


import android.os.Bundle;


import android.view.View;

import com.bindesh.aryaveerdalchattisgarh.pustakalaya.Aarsh_sahitya;
import com.bindesh.aryaveerdalchattisgarh.pustakalaya.Aryaveerdal_Ki_Pustakeen;


import com.bindesh.aryaveerdalchattisgarh.R;
import com.bindesh.aryaveerdalchattisgarh.pustakalaya.Swami_Devvratji_Ki_Pustakeen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class Pustakalaya extends AppCompatActivity {


    public CardView cardView1,cardView2,cardView3 , cardView4,cardView5,cardView6,cardView7,cardView8,cardView9,cardView10,cardView11,cardView12,cardView13,cardView14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pustakalaya);

        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView) findViewById(R.id.card2);
        cardView3 = (CardView) findViewById(R.id.card3);
      /*  cardView4 = (CardView) findViewById(R.id.card4);
        cardView5 = (CardView) findViewById(R.id.card5);
        cardView6 = (CardView) findViewById(R.id.card6);
        cardView7 = (CardView) findViewById(R.id.card7);
        cardView8 = (CardView) findViewById(R.id.card8);
        cardView9 = (CardView) findViewById(R.id.card9);
        cardView10 = (CardView) findViewById(R.id.card10);
        cardView11= (CardView) findViewById(R.id.card11);
        cardView12= (CardView) findViewById(R.id.card12);
        cardView13= (CardView) findViewById(R.id.card13);
        cardView14 = (CardView) findViewById(R.id.card14);*/

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pustakalaya.this, Aryaveerdal_Ki_Pustakeen.class);
                startActivity(i);

            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pustakalaya.this, Swami_Devvratji_Ki_Pustakeen.class);
                i.putExtra("keyHTML", "file:///android_asset/demo.html");
                String message = "Arya veer dal boudhik";
                i.putExtra("key", message);
                startActivity(i);

            }
        });

      /*    cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pustakalaya.this, Aarsh_sahitya.class);

                startActivity(i);

            }
        });

      cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pustakalaya.this, Webview.class);
                i.putExtra("keyHTML", "xyzzzz");
                String message = "Arya veer dal boudhik";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pustakalaya.this, Webview.class);
                i.putExtra("keyHTML", "https://drive.google.com/file/d/1QgLdHF2DkLVcsVxL1qahxy3vh3oB_Kxp/view?usp=sharing");
                String message = "प्राथमिक चिकित्सा ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pustakalaya.this, Webview.class);
                i.putExtra("keyHTML", "xyzzzz");
                String message = "Arya veer dal boudhik";
                i.putExtra("key", message);
                startActivity(i);

            }
        });

        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pustakalaya.this, Webview.class);
                i.putExtra("keyHTML", "https://drive.google.com/file/d/1J-oqtuvQezXBUBEBPLdDvRHP3eWJMoLI/view?usp=sharing");
                String message = "व्यक्तित्व विकास ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });

        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pustakalaya.this, Webview.class);
                i.putExtra("keyHTML", "xyzzzz");
                String message = "Arya veer dal boudhik";
                i.putExtra("key", message);
                startActivity(i);

            }
        });

        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pustakalaya.this, Webview.class);
                i.putExtra("keyHTML", "xyzzzz");
                String message = "Arya veer dal boudhik";
                i.putExtra("key", message);
                startActivity(i);

            }
        });

        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pustakalaya.this, Webview.class);
                i.putExtra("keyHTML", "https://drive.google.com/file/d/1vtwtckshw_tOy3GGFvE16lPwjzoeA4PB/view?usp=sharing");
                String message = "शस्त्राचार्य प्रथम दूतीय वर्ष  ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });

        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pustakalaya.this, Webview.class);
                i.putExtra("keyHTML", "https://drive.google.com/file/d/1CwppkXZ0cdXPB3RobIyPWbAer6qNb_Hm/view?usp=sharing");
                String message = "योग शिक्षा 1 ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });

        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pustakalaya.this, Webview.class);
                i.putExtra("keyHTML", "https://drive.google.com/file/d/1zGrCe96966ZH-jqADX2P3-4tyX4vNvmi/view?usp=sharing");
                String message = "योग शिक्षा 2 ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });

        cardView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pustakalaya.this, Webview.class);
                i.putExtra("keyHTML", "https://drive.google.com/file/d/1jXxfaEFVaoEYqI0T3coM4csBOluNvd9c/view?usp=sharing");
                String message = "योग शिक्षा 3 ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });

        cardView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pustakalaya.this, Webview.class);
                i.putExtra("keyHTML", "https://drive.google.com/file/d/1mWQxrHOZS2yEJbW9msQREEmv7sthf18K/view?usp=sharing");
                String message = "योग शिक्षा 4";
                i.putExtra("key", message);
                startActivity(i);

            }
        });*/


    }
}






























