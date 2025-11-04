package com.example.seblakku

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val rv = findViewById<RecyclerView>(R.id.recyclerViewMenu)
        rv.layoutManager = LinearLayoutManager(this)

        val list = sampleMenu()
        val adapter = MenuAdapter(list) { item ->
            val i = Intent(this, DetailActivity::class.java).apply {
                putExtra("nama", item.nama)
                putExtra("harga", item.harga)
                putExtra("deskripsi", item.deskripsi)
                putExtra("gambar", item.gambar)
            }
            startActivity(i)
        }
        rv.adapter = adapter
    }

    private fun sampleMenu(): List<MenuItem> {
        return listOf(
            MenuItem("Seblak Original","Rp 10.000","Seblak original pedas nikmat", R.drawable.seblak1),
            MenuItem("Seblak Ceker","Rp 12.000","Seblak dengan tambahan ceker empuk", R.drawable.seblak2),
            MenuItem("Seblak Baso","Rp 13.000","Isi bakso kenyal", R.drawable.seblak3),
            MenuItem("Seblak Sosis","Rp 11.000","Sosis crispy topping", R.drawable.seblak4),
            MenuItem("Seblak Tulang","Rp 14.000","Menunya spesial dengan tulang", R.drawable.seblak5),
            MenuItem("Seblak Seafood","Rp 15.000","Isi seafood segar", R.drawable.seblak6),
            MenuItem("Seblak Mie","Rp 10.000","Seblak plus mie kenyal", R.drawable.seblak7),
            MenuItem("Seblak Keju","Rp 12.000","Topping keju meleleh", R.drawable.seblak8),
            MenuItem("Seblak Level 5","Rp 13.000","Paling pedas level 5", R.drawable.seblak9),
            MenuItem("Seblak Komplit","Rp 16.000","Komplit isi ceker, baso, sosis", R.drawable.seblak10)
        )
    }
}
