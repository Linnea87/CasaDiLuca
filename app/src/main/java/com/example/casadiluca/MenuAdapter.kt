package com.example.casadiluca

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(
    // ====== Data source =====================================
    private var items: List<MenuItem>
) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    // ====== ViewHolder ======================================
    inner class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.menu_img)
        val title: TextView = itemView.findViewById(R.id.menu_title)
        val desc: TextView = itemView.findViewById(R.id.menu_desc)
    }

    // ---- Lifecycle: create & bind --------------------------
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.menu_container, parent, false)
        return MenuViewHolder(view)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val item = items[position]
        holder.image.setImageResource(item.imageResId)
        holder.title.text = item.name
        holder.desc.text = item.description
    }

    override fun getItemCount(): Int = items.size

    // ---- Data handling -------------------------------------
    fun submitList(newItems: List<MenuItem>) {
        items = newItems
        notifyDataSetChanged()
    }
}