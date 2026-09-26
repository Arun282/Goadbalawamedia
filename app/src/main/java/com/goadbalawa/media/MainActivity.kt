package com.goadbalawa.media
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity: ComponentActivity() {
 override fun onCreate(state: Bundle?) { super.onCreate(state); setContent { App() } }
 @OptIn(ExperimentalMaterial3Api::class)
 @Composable fun App() {
  MaterialTheme(colorScheme=lightColorScheme(primary=Color(0xFF7B1FA2))) {
   Scaffold(topBar={ TopAppBar(title={Text("Goad Balawa Media")}) }) { p ->
    Column(Modifier.fillMaxSize().padding(p).padding(20.dp)) {
     Text("@goad_balaha_media", style=MaterialTheme.typography.titleMedium)
     Spacer(Modifier.height(20.dp))
     Text("Goad Balawa Media", style=MaterialTheme.typography.headlineMedium)
     Spacer(Modifier.height(12.dp))
     Text("Local media updates, posts and community news.")
     Spacer(Modifier.height(24.dp))
     Button(onClick={startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/goad_balaha_media/")))}) { Text("Open Instagram") }
    }
   }
  }
 }
}