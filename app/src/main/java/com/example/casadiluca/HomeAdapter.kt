package com.example.casadiluca

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HomeAdapter(
    private val items: List<HomeItem>
) : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    // ===== VIEW HOLDER ==========================================
    class HomeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val img: ImageView = view.findViewById(R.id.card_img)
        val title: TextView = view.findViewById(R.id.card_title)
        val desc: TextView = view.findViewById(R.id.card_desc)
    }

    // ===== INFLATE LAYOUT =======================================
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_home_container, parent, false)   // 👈 UPDATED
        return HomeViewHolder(view)
    }

    // ===== BIND DATA =============================================
    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val item = items[position]

        holder.img.setImageResource(item.imageResId)
        holder.title.setText(item.titleResId)
        holder.desc.setText(item.descResId)
    }

    override fun getItemCount(): Int = items.size
}