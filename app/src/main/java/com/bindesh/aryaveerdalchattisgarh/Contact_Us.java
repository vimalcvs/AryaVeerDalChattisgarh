package com.bindesh.aryaveerdalchattisgarh;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bindesh.aryaveerdalchattisgarh.contact_us.Contact_us_Aryaveerangnadal;
import com.bindesh.aryaveerdalchattisgarh.contact_us.Contact_us_Aryaveerdal;
import com.bindesh.aryaveerdalchattisgarh.contact_us.Rupendra_arya;
import com.bindesh.aryaveerdalchattisgarh.contact_us.Social_media_comety;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Contact_Us extends AppCompatActivity {
  CardView cardView1, cardView2, cardView3, cardView4;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_contact__us);

    cardView1 = (CardView) findViewById(R.id.card1);
    cardView2 = (CardView) findViewById(R.id.card2);
    cardView3 = (CardView) findViewById(R.id.card3);
    cardView4 = (CardView) findViewById(R.id.card4);

    cardView1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent myIntent = new Intent(Contact_Us.this, Contact_us_Aryaveerdal.class);
        startActivity(myIntent);
      }
    });

    cardView2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent myIntent = new Intent(Contact_Us.this, Contact_us_Aryaveerangnadal.class);
        startActivity(myIntent);
      }
    });
    cardView3.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent myIntent = new Intent(Contact_Us.this, Social_media_comety.class);
        startActivity(myIntent);
      }
    });
    cardView4.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent myIntent = new Intent(Contact_Us.this, Rupendra_arya.class);
        startActivity(myIntent);
      }
    });
  }
}
