package com.example.seblakku

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Tombol langsung ke Login atau ke Menu (sesuaikan)
        findViewById<Button>(R.id.btnMulai).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        // Atau auto-splash: uncomment jika ingin auto-forward setelah 1.5s
        // Handler(Looper.getMainLooper()).postDelayed({
        //     startActivity(Intent(this, LoginActivity::class.java))
        //     finish()
        // }, 1500)
    }
}
