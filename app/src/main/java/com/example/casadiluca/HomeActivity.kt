package com.example.casadiluca

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    // ====== View References ==================================
    private lateinit var btnInfo: ImageButton
    private lateinit var welcomeRecycler: RecyclerView
    private lateinit var welcomeAdapter: HomeAdapter
    private lateinit var homeRecycler: RecyclerView
    private lateinit var homeAdapter: HomeAdapter

    // ====== Lifecycle =========================================
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // ---- Setup: Find Views --------------------------------

        btnInfo = findViewById(R.id.btn_info)

        welcomeRecycler = findViewById(R.id.welcome_recycler)
        welcomeAdapter = HomeAdapter(HomeData.welcome)
        welcomeRecycler.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        welcomeRecycler.adapter = welcomeAdapter

        homeRecycler = findViewById(R.id.home_recycler)
        homeAdapter = HomeAdapter(HomeData.highlights)
        homeRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        homeRecycler.adapter = homeAdapter


        // ---- Info button / popup ------------------------------

        btnInfo.setOnClickListener {
            showInfoPopup()
        }

        // ---- Bottom Navigation -------------------------------

        val bottonNav = findViewById<BottomNavigationView>(R.id.bottom_nav)

        bottonNav.selectedItemId = R.id.nav_home

        bottonNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    true
                }
                R.id.nav_drinks -> {
                    val intent = Intent(this, MenuActivity::class.java)
                    intent.putExtra("CATEGORY", "DRINKS")
                    startActivity(intent)
                    true
                }
                R.id.nav_food -> {
                    val intent = Intent(this, MenuActivity::class.java)
                    intent.putExtra("CATEGORY", "FOOD")
                    startActivity(intent)
                    true
                }
                else -> false
            }
        }
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