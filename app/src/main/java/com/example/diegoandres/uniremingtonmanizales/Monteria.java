package com.example.diegoandres.uniremingtonmanizales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Monteria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monteria);

        WebView view = (WebView) findViewById(R.id.monteria);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("http://www.uniremington.edu.co/monteria/");
    }
}
