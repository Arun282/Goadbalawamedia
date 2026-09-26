package com.goadbalawa.media

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

class MainActivity : ComponentActivity() {
 override fun onCreate(state: Bundle?) {
  super.onCreate(state)
  setContent { InstagramFeed() }
 }
 @OptIn(ExperimentalMaterial3Api::class)
 @Composable
 fun InstagramFeed() {
  Scaffold(topBar={ TopAppBar(title={ Text("Goad Balawa Media") }) }) { _ ->
   AndroidView(
    modifier=Modifier.fillMaxSize(),
    factory={ context ->
     WebView(context).apply {
      settings.javaScriptEnabled=true
      settings.domStorageEnabled=true
      settings.cacheMode=WebSettings.LOAD_DEFAULT
      settings.userAgentString="Mozilla/5.0 (Linux; Android 15) AppleWebKit/537.36 Chrome/140 Mobile Safari/537.36"
      webViewClient=WebViewClient()
      loadUrl("https://www.instagram.com/goad_balaha_media/")
     }
    }
   )
  }
 }
}