package com.example.casadiluca

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    // ====== View References ==================================
    private lateinit var menuRecycler: RecyclerView
    private lateinit var menuAdapter: MenuAdapter
    private lateinit var menuCategoryTitle: TextView
    private lateinit var menuSection: LinearLayout
    private lateinit var btnBack: Button
    private lateinit var menuDivider: View
    private lateinit var btnInfo: ImageButton

    // ====== Lifecycle =========================================
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // ---- Setup: Find Views --------------------------------
        val btnStarters = findViewById<Button>(R.id.btn_starters)
        val btnMains = findViewById<Button>(R.id.btn_mains)
        val btnDesserts = findViewById<Button>(R.id.btn_desserts)
        val btnDrinks = findViewById<Button>(R.id.btn_drinks)


        menuRecycler = findViewById(R.id.menu_recycler)
        menuCategoryTitle = findViewById(R.id.menu_category_title)
        menuSection = findViewById(R.id.menu_section)
        btnBack = findViewById(R.id.btn_back)
        menuDivider = findViewById(R.id.menu_divider)
        btnInfo = findViewById(R.id.btn_info)

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

        btnBack.setOnClickListener {
            goBackToMenu()
        }

        btnInfo.setOnClickListener {
            showInfoPopup()
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

    // ====== Popup Navigation ===================================
    private fun showInfoPopup() {

        val dialogView = LayoutInflater.from(this).inflate(R.layout.popup_container, null)

        val dialog = AlertDialog.Builder(this)
            .setView(dialogView)
            .create()

        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val btnInstagram = dialogView.findViewById<ImageButton>(R.id.popup_instagram)
        val btnFacebook = dialogView.findViewById<ImageButton>(R.id.popup_facebook)

        btnInstagram.setOnClickListener {
            //link later
        }

        btnFacebook.setOnClickListener {
            // link later
        }

        val btnClose = dialogView.findViewById<ImageButton>(R.id.btn_close)

        btnClose.setOnClickListener {
            dialog.dismiss()
        }

        dialog.show()
    }

}