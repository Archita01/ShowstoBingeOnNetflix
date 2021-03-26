package com.example.showstobingeonnetflix;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.time.format.TextStyle;

public class MainActivity2 extends AppCompatActivity {

    WebView webv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webv = findViewById(R.id.webView);
        webv.setWebViewClient(new WebViewClient());
        webv.loadUrl("https://www.netflix.com/in/Login");

    }
}