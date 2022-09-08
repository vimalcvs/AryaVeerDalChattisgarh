package com.bindesh.aryaveerdalchattisgarh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class Developer_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_profile);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String link = "<a href=\"https://untoldtruth.in/contact-us\">Vist our Website</a>";
        String facbook = "<a href=\"https://www.facebook.com/profile.php?id=100010738326167\">Like us on Facbook</a>";
        String twitter = "<a href=\"https://twitter.com/bindeshyadav3\">Follow us on Twitter</a>";
        String whatsapp = "<a href=\"https://t.me/bindeshyadav\">Contact via Telegram</a>";
        String google = "<a href=\"https://www.youtube.com/channel/UCkC3qvuMWggMlhSEOwQEZFQ\">Subscribe my Youtube Channel</a>";
        String instagram = "<a href=\"https://www.instagram.com/yadavbindesh0856\">Follow us on Instagram</a>";


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
    }

}

