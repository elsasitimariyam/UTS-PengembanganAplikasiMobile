package com.example.seblakku

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val img = findViewById<ImageView>(R.id.detailImage)
        val txtNama = findViewById<TextView>(R.id.detailName)
        val txtHarga = findViewById<TextView>(R.id.detailPrice)
        val txtDesc = findViewById<TextView>(R.id.detailDesc)
        val btnOrder = findViewById<Button>(R.id.btnOrder)

        val nama = intent.getStringExtra("nama") ?: "-"
        val harga = intent.getStringExtra("harga") ?: "-"
        val deskripsi = intent.getStringExtra("deskripsi") ?: "-"
        val gambar = intent.getIntExtra("gambar", 0)

        txtNama.text = nama
        txtHarga.text = harga
        txtDesc.text = deskripsi
        if (gambar != 0) img.setImageResource(gambar)

        btnOrder.setOnClickListener {
            val i = Intent(this, CheckoutActivity::class.java).apply {
                putExtra("nama", nama)
                putExtra("harga", harga)
                putExtra("gambar", gambar)
            }
            startActivity(i)
        }
    }
}
