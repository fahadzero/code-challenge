package com.alc.kato;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.GeolocationPermissions;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView _webView = findViewById(R.id.webView);

        _webView.getSettings().setJavaScriptEnabled(true);
        _webView.getSettings().setAppCacheEnabled(true);
        _webView.getSettings().setDatabaseEnabled(true);
        _webView.getSettings().setDomStorageEnabled(true);
        _webView.getSettings().setSupportZoom(true);
        _webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        _webView.getSettings().setBuiltInZoomControls(true);

        _webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });

        _webView.loadUrl("https://andela.com/alc/ ");


        Toast.makeText(AboutActivity.this, _webView.getUrl(), Toast.LENGTH_LONG).show();
    }

}

