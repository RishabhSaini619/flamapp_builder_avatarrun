package com.flamapp.builder_avatarrun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonFlam = findViewById<Button>(R.id.flam_button)
        val buttonRPM = findViewById<Button>(R.id.rpm_button)
        buttonFlam.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("URL", "https://fe-avatar-system-next.vercel.app/")
            startActivity(intent)
        }
        buttonRPM.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("URL", "https://flam.readyplayer.me/avatar?frameApi")
            startActivity(intent)
        }

    }
}