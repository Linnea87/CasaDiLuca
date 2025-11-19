package com.example.casadiluca

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment(R.layout.fragment_home) {

    // ====== View References ==================================
    private lateinit var btnInfo: ImageButton
    private lateinit var welcomeRecycler: RecyclerView
    private lateinit var welcomeAdapter: HomeAdapter
    private lateinit var homeRecycler: RecyclerView
    private lateinit var homeAdapter: HomeAdapter

    // ====== View lifecycle ====================================
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // ---- Setup: Find Views (via view) ---------------------
        btnInfo = view.findViewById(R.id.btn_info)

        welcomeRecycler = view.findViewById(R.id.welcome_recycler)
        welcomeAdapter = HomeAdapter(HomeData.welcome)
        welcomeRecycler.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        welcomeRecycler.adapter = welcomeAdapter

        homeRecycler = view.findViewById(R.id.home_recycler)
        homeAdapter = HomeAdapter(HomeData.highlights)
        homeRecycler.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        homeRecycler.adapter = homeAdapter

        // ---- Info button / popup ------------------------------
        btnInfo.setOnClickListener {
            showInfoPopup()
        }
    }

    // ====== Popup Navigation ===================================
    private fun showInfoPopup() {
        val dialogView = LayoutInflater.from(requireContext())
            .inflate(R.layout.popup_container, null)

        val dialog = AlertDialog.Builder(requireContext())
            .setView(dialogView)
            .create()

        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val btnInstagram = dialogView.findViewById<ImageButton>(R.id.popup_instagram)
        val btnFacebook = dialogView.findViewById<ImageButton>(R.id.popup_facebook)

        btnInstagram.setOnClickListener {
            // link later
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