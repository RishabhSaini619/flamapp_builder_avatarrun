package com.flamapp.builder_avatarrun

import android.os.Bundle
import android.util.Log
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val webView = findViewById<WebView>(R.id.web_view_field)

        val url = intent.getStringExtra("URL")
        Log.i("URL",url.toString())
        if (url != null) {

            webView.apply {
                loadUrl(url.toString())
                settings.javaScriptEnabled = true
                settings.allowFileAccess = true
                settings.databaseEnabled = true
                settings.allowContentAccess = true
                settings.domStorageEnabled = true
                settings.builtInZoomControls = false
                settings.cacheMode = WebSettings.LOAD_DEFAULT
                settings.javaScriptCanOpenWindowsAutomatically = true
            }
        }

    }
}