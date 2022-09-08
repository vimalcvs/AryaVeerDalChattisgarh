package com.bindesh.aryaveerdalchattisgarh.vyayamsangeet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.bindesh.aryaveerdalchattisgarh.Webview;
import com.bindesh.aryaveerdalchattisgarh.R;

public class Aryaveerdal_Vyayam_Sangeet extends AppCompatActivity {

    public CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6,
            cardView7,cardView8,cardView9,cardView10,cardView11,cardView12,
            cardView13,cardView14,cardView15,cardView16,cardView17,cardView18,cardView19,cardView20,cardView21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aryaveerdal__vyayam__sangeet);


        cardView1 = (CardView) findViewById(R.id.card1);
        cardView2 = (CardView)findViewById(R.id.card2);
        cardView3 =(CardView)findViewById(R.id.card3);
        cardView4 =(CardView)findViewById(R.id.card4);
        cardView5 =(CardView)findViewById(R.id.card5);
        cardView6 =(CardView)findViewById(R.id.card6);
        cardView7 =(CardView)findViewById(R.id.card7);
        cardView8 =(CardView)findViewById(R.id.card8);
        cardView9 =(CardView)findViewById(R.id.card9);
        cardView10 =(CardView)findViewById(R.id.card10);
        cardView11 =(CardView)findViewById(R.id.card11);
        cardView12 =(CardView)findViewById(R.id.card12);
        cardView13 =(CardView)findViewById(R.id.card13);
        cardView14 =(CardView)findViewById(R.id.card14);
        cardView15 =(CardView)findViewById(R.id.card15);
        cardView16 =(CardView)findViewById(R.id.card16);
        cardView17 =(CardView)findViewById(R.id.card17);
        cardView18 =(CardView)findViewById(R.id.card18);
        cardView19 =(CardView)findViewById(R.id.card19);
        cardView20 =(CardView)findViewById(R.id.card20);
        cardView21 =(CardView)findViewById(R.id.card21);


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/nandi_path.mp3");
                String message = "निनाद ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/swagatam.mp3");
                String message = "स्वागतम ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/slow_march.mp3");
                String message = "निरीक्षण चाल ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/F 06 Sarvang Sundar Vyayam.mp3");
                String message = "सर्वांग सुंदरम व्यायाम ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/G 07 Shury namskar .mp3");
                String message = "सूर्य नमस्कार ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/H 08 Bhumi Namaskar.mp3");
                String message = "भूमि नमस्कार ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });

        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/Chandra namaskaar Remake.mp3");
                String message = "चंद्र नमस्कार ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/pared.mp3");
                String message = "परेड ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/Ho rahi dhara vikal.mp3");
                String message = "हो रही धार विकल  ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/Dambal.mp3");
                String message = "डंबल  ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/Raag bhoopali.mp3");
                String message = "राग भूपाली  ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/Dand beitak.mp3");
                String message = "दंड बैठक  ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/Malkamb.mp3");
                String message = "मलखंब  ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
       /* cardView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Aryaveerdal_Vyayam_Sangeet.this, "इस पेज को खोलने की अनुमति आप को नहीं है ", Toast.LENGTH_SHORT).show();

                Intent myIntent = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                startActivity(myIntent);

            }
        });*/

        cardView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/लेज़ियम.mp3");
                String message = "घाटी लेजियम  ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
       /* cardView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Aryaveerdal_Vyayam_Sangeet.this, "इस पेज को खोलने की अनुमति आप को नहीं है ", Toast.LENGTH_SHORT).show();

                Intent myIntent = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                startActivity(myIntent);

            }
        });*/
        cardView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/Dwandwa.mp3");
                String message = "द्वन्द  ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/aasan.mp3");
                String message = "योगासन  ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/rastriya.mp3");
                String message = "राष्ट्रीय प्रार्थना  ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/Dwajeyam Muda.mp3");
                String message = "ध्वजगान  ";
                i.putExtra("key", message);
                startActivity(i);

            }
        });
        cardView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Aryaveerdal_Vyayam_Sangeet.this, Webview.class);
                i.putExtra("keyHTML", "https://untoldtruth.in/aryaveerdal/Aryaveerdal_vyayam_sangeet/cammando.mp3");
                String message = "कमांडो";
                i.putExtra("key", message);
                startActivity(i);

            }
        });




    }
}