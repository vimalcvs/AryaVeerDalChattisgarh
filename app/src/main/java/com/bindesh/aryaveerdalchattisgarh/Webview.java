package com.bindesh.aryaveerdalchattisgarh;

import android.app.ProgressDialog;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class Webview extends AppCompatActivity {

  WebView webView;
  ProgressDialog progressDialog;

  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_webview);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    String message = getIntent().getStringExtra("key").toString();
    setTitle(message);
    Bundle extras = getIntent().getExtras();

    String value = "file:///android_asset/.htm";
    if(extras !=null) {
      value = extras.getString("keyHTML");
    }

    webView = (WebView)findViewById(R.id.kamal);
    webView.loadUrl(value);
    init();
  }

  private void init() {
    webView = (WebView) findViewById(R.id.kamal);
    webView.getSettings().setBuiltInZoomControls(true);
    webView.setBackgroundColor(0);
    webView.getSettings().setJavaScriptEnabled(true);
    progressDialog = new ProgressDialog(Webview.this);
    progressDialog.setMessage("Loading...");
    progressDialog.setCancelable(false);
    progressDialog.show();

    webView.setWebViewClient(new WebViewClient() {

      public void onPageFinished(WebView view, String url) {
        try {
          progressDialog.dismiss();
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }
  @Override
  public void onBackPressed() {

    if (webView.canGoBack()){
      webView.goBack();
    }
    else {
      super.onBackPressed();
    }

  }
}
