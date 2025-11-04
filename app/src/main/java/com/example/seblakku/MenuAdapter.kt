package com.example.seblakku

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(
    private val items: List<MenuItem>,
    private val onItemClick: (MenuItem) -> Unit
) : RecyclerView.Adapter<MenuAdapter.VH>() {

    inner class VH(view: View) : RecyclerView.ViewHolder(view) {
        val img = view.findViewById<ImageView>(R.id.menuImage)
        val nama = view.findViewById<TextView>(R.id.menuName)
        val harga = view.findViewById<TextView>(R.id.menuPrice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        return VH(v)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = items[position]
        holder.nama.text = item.nama
        holder.harga.text = item.harga
        holder.img.setImageResource(item.gambar)
        holder.itemView.setOnClickListener { onItemClick(item) }
    }

    override fun getItemCount(): Int = items.size
}
