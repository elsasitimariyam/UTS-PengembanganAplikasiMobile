package com.example.seblakku

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CheckoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)

        val txtItem = findViewById<TextView>(R.id.checkoutItem)
        val txtPrice = findViewById<TextView>(R.id.checkoutPrice)
        val etNama = findViewById<EditText>(R.id.etNama)
        val etAlamat = findViewById<EditText>(R.id.etAlamat)
        val btnKirim = findViewById<Button>(R.id.btnKirim)

        val namaMenu = intent.getStringExtra("nama") ?: "-"
        val harga = intent.getStringExtra("harga") ?: "-"

        txtItem.text = namaMenu
        txtPrice.text = harga

        btnKirim.setOnClickListener {
            val pemesan = etNama.text.toString().trim()
            val alamat = etAlamat.text.toString().trim()
            if (pemesan.isEmpty() || alamat.isEmpty()) {
                // simple check
                return@setOnClickListener
            }
            val i = Intent(this, SuccessActivity::class.java).apply {
                putExtra("pemesan", pemesan)
                putExtra("alamat", alamat)
                putExtra("item", namaMenu)
                putExtra("harga", harga)
            }
            startActivity(i)
            finish()
        }
    }
}
