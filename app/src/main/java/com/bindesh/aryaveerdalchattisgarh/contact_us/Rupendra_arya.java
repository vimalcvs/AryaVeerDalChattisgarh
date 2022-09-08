package com.bindesh.aryaveerdalchattisgarh.contact_us;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.bindesh.aryaveerdalchattisgarh.R;

public class Rupendra_arya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rupendra_arya);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String link = "<a href=\"https://www.sarvadeshikaryaveerdal.com\">Vist our Website</a>";
        String facbook = "<a href=\"https://www.facebook.com/AryaRupendra\">Like us on Facbook</a>";
        String twitter = "<a href=\"https://twitter.com/Rupendra__arya\">Follow us on Twitter</a>";
        String whatsapp = "<a href=\"https://t.me/RupendraArya\">Join Telegram Groups</a>";
        String google = "<a href=\"https://www.youtube.com/c/RupendraArya\">Subscribe my Youtube Channel</a>";
        String instagram = "<a href=\"https://www.instagram.com/rupendra_arya\">Follow us on Instagram</a>";
        String gmail = "<a href=\"https://www.rupendraaryaveer@gmail.com\">Email Us:- rupendraaryaveer@gmail.com</a>";
        String wikipedia = "<a href=\"https://wikipedia.org/wiki/Aryaveeranganadal\">Wikipedia</a>";


        TextView text = (TextView) findViewById(R.id.id_link);
        text.setText(Html.fromHtml(link));
        text.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text1 = (TextView) findViewById(R.id.id_facbook);
        text1.setText(Html.fromHtml(facbook));
        text1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text2 = (TextView) findViewById(R.id.id_twitter);
        text2.setText(Html.fromHtml(twitter));
        text2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text3 = (TextView) findViewById(R.id.id_whatsapp);
        text3.setText(Html.fromHtml(whatsapp));
        text3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text4 = (TextView) findViewById(R.id.id_google);
        text4.setText(Html.fromHtml(google));
        text4.setMovementMethod(LinkMovementMethod.getInstance());


        TextView text5 = (TextView) findViewById(R.id.id_instagram);
        text5.setText(Html.fromHtml(instagram));
        text5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text6 = (TextView) findViewById(R.id.id_gmail);
        text6.setText(Html.fromHtml(gmail));
        text6.setMovementMethod(LinkMovementMethod.getInstance());

        TextView text7 = (TextView) findViewById(R.id.id_wikipedia);
        text7.setText(Html.fromHtml(wikipedia));
        text7.setMovementMethod(LinkMovementMethod.getInstance());
    }

}

