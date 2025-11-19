package com.example.casadiluca

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuActivity : AppCompatActivity() {

    private lateinit var menuRecycler: RecyclerView
    private lateinit var menuAdapter: MenuAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        menuRecycler = findViewById(R.id.menu_recycler)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_nav)

        // Vilken kategori kom vi hit med? ("FOOD" / "DRINKS")
        val category = intent.getStringExtra("CATEGORY")

        // Välj vilka rätter som ska visas
        val itemsToShow: List<MenuItem> = when (category) {
            "DRINKS" -> {
                // TODO: ersätt med riktig drinks-lista när ja har den
                emptyList()
            }
            "FOOD" -> {
                MenuData.starters + MenuData.mains + MenuData.desserts
            }
            else -> {
                MenuData.starters + MenuData.mains + MenuData.desserts
            }
        }

        menuAdapter = MenuAdapter(itemsToShow)
        menuRecycler.layoutManager = LinearLayoutManager(this)
        menuRecycler.adapter = menuAdapter

        // Sätt rätt markerad ikon i footern
        bottomNav.selectedItemId = when (category) {
            "DRINKS" -> R.id.nav_drinks
            else -> R.id.nav_food
        }

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    val intent = Intent(this, MainActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                    startActivity(intent)
                    true
                }

                R.id.nav_drinks -> {
                    // Om vi redan är på DRINKS: gör inget
                    if (category == "DRINKS") {
                        true
                    } else {
                        val intent = Intent(this, MenuActivity::class.java)
                        intent.putExtra("CATEGORY", "DRINKS")
                        startActivity(intent)
                        finish()
                        true
                    }
                }

                R.id.nav_food -> {
                    // Om vi redan är på FOOD: gör inget
                    if (category == "FOOD" || category == null) {
                        true
                    } else {
                        val intent = Intent(this, MenuActivity::class.java)
                        intent.putExtra("CATEGORY", "FOOD")
                        startActivity(intent)
                        finish()
                        true
                    }
                }

                else -> false
            }
        }
    }
}