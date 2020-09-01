package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView myw = (WebView) findViewById(R.id.my_web);
        myw.getSettings().setJavaScriptEnabled(true);
        myw.setWebViewClient(new WebViewClient());
        myw.loadUrl("https://www.baidu.com/");


    }
}