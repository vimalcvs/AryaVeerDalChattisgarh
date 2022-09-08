package com.bindesh.aryaveerdalchattisgarh.anime;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bindesh.aryaveerdalchattisgarh.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class AnimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime);



        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(v -> AnimeActivity.super.onBackPressed());



        getSupportActionBar().hide();
        String name  = getIntent().getExtras().getString("anime_name");
        String description = getIntent().getExtras().getString("anime_description");

        String category = getIntent().getExtras().getString("anime_category");
       ;
        String image_url = getIntent().getExtras().getString("anime_img") ;

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingtoolbar_id);
        collapsingToolbarLayout.setTitleEnabled(true);


        TextView tv_name = findViewById(R.id.aa_anime_name);

        TextView tv_categorie = findViewById(R.id.aa_categorie) ;

        ImageView img = findViewById(R.id.aa_thumbnail);

        tv_name.setText(name);
        tv_categorie.setText(category);

        collapsingToolbarLayout.setTitle(name);

        WebView webView = findViewById(R.id.aa_description);
        // webView.setWebViewClient(new WebViewClient());
        // webView.getSettings().setJavaScriptEnabled(true);
        //webView.loadData(description, "text/html", "UTF-8");
        webView.loadData(description, "text/html; charset=utf-8", "UTF-8");
        RequestOptions requestOptions = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);

        Glide.with(this)
                .load(image_url)
                .apply(requestOptions)
                .into(img);

    }
}
