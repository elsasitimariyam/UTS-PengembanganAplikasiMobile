package com.example.seblakku

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val etNama = findViewById<EditText>(R.id.etNama)
        val etUser = findViewById<EditText>(R.id.etUsername)
        val etPass = findViewById<EditText>(R.id.etPassword)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val nama = etNama.text.toString().trim()
            val user = etUser.text.toString().trim()
            val pass = etPass.text.toString().trim()
            if (nama.isEmpty() || user.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Isi semua field", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Registrasi berhasil", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}
