package com.lyg.czgoa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AttachActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attach);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url");

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl(url);
    }
}
