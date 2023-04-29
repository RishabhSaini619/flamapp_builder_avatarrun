package com.flamapp.builder_avatarrun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonFlam = findViewById<ImageButton>(R.id.button_flam)
        val buttonRPM = findViewById<ImageButton>(R.id.button_rpm)

        buttonFlam.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("URL", "https://fe-avatarsystem-dev.vercel.app/")
            startActivity(intent)
        }
        buttonRPM.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("URL", "https://flam.readyplayer.me/avatar?frameApi")
            startActivity(intent)
        }

    }
}