package com.example.primeiroapp.exemplo7;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.primeiroapp.R;

public class WebViewActivity extends AppCompatActivity {

    Button btnHtml, btnWeb;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        btnHtml = (Button) findViewById(R.id.btnHtml);
        btnWeb = (Button) findViewById(R.id.btnWeb);
        webView = (WebView) findViewById(R.id.webView);

        btnHtml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaHtml();
            }
        });

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chamaWeb();
            }
        });
    }

    private void chamaWeb() {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://github.com");
    }

    private void chamaHtml() {
        String customHtml =
                "<html>"+
                    "<body>"+
                        "<h1>Hello, <font color='blue'> World !</font> </h1>"+
                    "</body>"+
                "</html>";
        webView.loadData(customHtml,"text/html","utf-8");
    }
}
