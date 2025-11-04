package com.example.seblakku

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etUser = findViewById<EditText>(R.id.etUsername)
        val etPass = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvRegister = findViewById<TextView>(R.id.tvRegister)

        btnLogin.setOnClickListener {
            val user = etUser.text.toString().trim()
            val pass = etPass.text.toString().trim()
            if (user.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Isi username & password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            // Untuk tugas: login sederhana (tanpa backend)
            val i = Intent(this, MenuActivity::class.java)
            i.putExtra("username", user)
            startActivity(i)
            finish()
        }

        tvRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
