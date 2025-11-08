package com.example.casadiluca

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    // ====== View References ==================================
    private lateinit var menuRecycler: RecyclerView
    private lateinit var menuAdapter: MenuAdapter
    private lateinit var menuCategoryTitle: TextView
    private lateinit var menuSection: LinearLayout
    private lateinit var btnBack: Button
    private lateinit var menuDivider: View

    // ====== Lifecycle =========================================
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ---- Setup: Find Views --------------------------------
        val btnStarters = findViewById<Button>(R.id.btn_starters)
        val btnMains = findViewById<Button>(R.id.btn_mains)
        val btnDesserts = findViewById<Button>(R.id.btn_desserts)
        val btnDrinks = findViewById<Button>(R.id.btn_drinks) // för framtiden

        menuRecycler = findViewById(R.id.menu_recycler)
        menuCategoryTitle = findViewById(R.id.menu_category_title)
        menuSection = findViewById(R.id.menu_section)
        btnBack = findViewById(R.id.btn_back)
        menuDivider = findViewById(R.id.menu_divider)

        // ---- Setup: RecyclerView ------------------------------
        menuRecycler.layoutManager = LinearLayoutManager(this)
        menuAdapter = MenuAdapter(emptyList())
        menuRecycler.adapter = menuAdapter

        // ---- Setup: Button Listeners --------------------------
        btnStarters.setOnClickListener {
            showCategory(getString(R.string.menu_starters), MenuData.starters)
        }

        btnMains.setOnClickListener {
            showCategory(getString(R.string.menu_mains), MenuData.mains)
        }

        btnDesserts.setOnClickListener {
            showCategory(getString(R.string.menu_desserts), MenuData.desserts)
        }

        // (Drinks-knappen får funktion senare när du har MenuData.drinks)

        btnBack.setOnClickListener {
            goBackToMenu()
        }
    }

    // ====== Menu Navigation ===================================
    private fun showCategory(title: String, items: List<MenuItem>) {
        menuCategoryTitle.text = title
        menuCategoryTitle.visibility = View.VISIBLE
        menuDivider.visibility = View.VISIBLE

        menuSection.visibility = View.GONE
        menuRecycler.visibility = View.VISIBLE
        btnBack.visibility = View.VISIBLE

        menuAdapter.submitList(items)
    }

    private fun goBackToMenu() {
        menuRecycler.visibility = View.GONE
        menuCategoryTitle.visibility = View.GONE
        menuDivider.visibility = View.GONE
        btnBack.visibility = View.GONE
        menuSection.visibility = View.VISIBLE

        menuAdapter.submitList(emptyList())
    }
}