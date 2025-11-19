package com.example.casadiluca

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    // ====== Lifecycle =========================================
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)

        // Starta på Home första gången
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment())
                .commit()
        }

        // ---- Bottom Navigation -------------------------------
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, HomeFragment())
                        .commit()
                    true
                }
                R.id.nav_drinks -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, MenuFragment.newInstance("DRINKS"))
                        .commit()
                    true
                }
                R.id.nav_food -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, MenuFragment.newInstance("FOOD"))
                        .commit()
                    true
                }
                else -> false
            }
        }

        // Se till att rätt ikon är markerad när appen startar
        bottomNav.selectedItemId = R.id.nav_home
    }
}