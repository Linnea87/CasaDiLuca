package com.example.casadiluca

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MenuActivity : AppCompatActivity() {

    private lateinit var menuRecycler: RecyclerView
    private lateinit var menuAdapter: MenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        menuRecycler = findViewById(R.id.menu_recycler)

        val allDishes: List<MenuItem> =
            MenuData.starters +
                    MenuData.mains +
                    MenuData.desserts

        menuAdapter = MenuAdapter(allDishes)
        menuRecycler.layoutManager = LinearLayoutManager(this)
        menuRecycler.adapter = menuAdapter

    }
}