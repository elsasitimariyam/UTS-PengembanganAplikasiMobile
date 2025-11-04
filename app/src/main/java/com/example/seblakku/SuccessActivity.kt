package com.example.seblakku

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SuccessActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        val tv = findViewById<TextView>(R.id.tvSuccess)
        val pemesan = intent.getStringExtra("pemesan") ?: "-"
        val alamat = intent.getStringExtra("alamat") ?: "-"
        val item = intent.getStringExtra("item") ?: "-"
        val harga = intent.getStringExtra("harga") ?: "-"

        val message = "Terima kasih $pemesan!\nPesanan: $item ($harga)\nAkan dikirim ke: $alamat"
        tv.text = message
    }
}
