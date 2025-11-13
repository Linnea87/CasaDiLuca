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

class HomeActivity : AppCompatActivity() {

    // ====== View References ==================================
    private lateinit var btnInfo: ImageButton
    private lateinit var homeRecycler: RecyclerView
    private lateinit var homeAdapter: HomeAdapter

    // ====== Lifecycle =========================================
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // ---- Setup: Find Views --------------------------------

        val btnOpenMenu = findViewById<Button>(R.id.btn_open_menu)


        btnInfo = findViewById(R.id.btn_info)

        homeRecycler = findViewById(R.id.home_recycler)
        homeAdapter = HomeAdapter(HomeData.highlights)
        homeRecycler.layoutManager = LinearLayoutManager(this)
        homeRecycler.adapter = homeAdapter

        // ---- Setup: RecyclerView ------------------------------

        btnOpenMenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
        // ---- Setup: Button Listeners --------------------------

        btnInfo.setOnClickListener {
            showInfoPopup()
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