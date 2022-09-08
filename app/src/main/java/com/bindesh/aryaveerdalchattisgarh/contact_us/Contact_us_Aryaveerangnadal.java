package com.bindesh.aryaveerdalchattisgarh.contact_us;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.bindesh.aryaveerdalchattisgarh.R;

public class Contact_us_Aryaveerangnadal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us__aryaveerangnadal);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String link = "<a href=\"https://www.sarvadeshikaryaveerdal.com\">Vist our Website</a>";
        String facbook = "<a href=\"https://www.facebook.com/Aryaveeranganadal\">Like us on Facbook</a>";
        String twitter = "<a href=\"https://twitter.com/veeranganadal\">Follow us on Twitter</a>";
        String whatsapp = "<a href=\"https://t.me/Aryaveeranganadal\">Join Telegram Groups</a>";
        String google = "<a href=\"https://www.youtube.com/channel/UCljadPfH-3gEy4h2Vq13j0w\">Subscribe my Youtube Channel</a>";
        String instagram = "<a href=\"https://www.instagram.com/Aryaveeranganadal\">Follow us on Instagram</a>";



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
/*
        TextView text6 = (TextView) findViewById(R.id.id_gmail);
        text6.setText(Html.fromHtml(gmail));
        Intent Email = new Intent(Intent.ACTION_SEND);
        Email.setType("text/email");
        Email.putExtra(Intent.EXTRA_EMAIL, new String[] { "sarvadeshikaryaveerdal@gmail.com" });
        Email.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
        Email.putExtra(Intent.EXTRA_TEXT, "Dear ...," + "");
        startActivity(Intent.createChooser(Email, "Send Feedback Email:"));
       */

    }

}

