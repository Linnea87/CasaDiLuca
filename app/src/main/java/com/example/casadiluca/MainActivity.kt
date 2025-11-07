package com.example.casadiluca

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerDishes: RecyclerView
    private lateinit var dishesAdapter: DishesAdapter
    private lateinit var textCategoryTitle: TextView
    private lateinit var layoutMenuSection: LinearLayout
    private lateinit var buttonBackToMenu: Button
    private lateinit var viewMenuDivider: View

    private val starters = mutableListOf(
        Dish("Bruschetta", "Grilled bread with tomatoes and olive oil", R.drawable.dish_bruschetta),
        Dish("Caprese Salad", "Mozzarella, tomatoes, and fresh basil", R.drawable.dish_caprese_salad),
        Dish("Carpaccio", "Thinly sliced beef with olive oil and lemon", R.drawable.dish_carpaccio)
    )

    private val mains = mutableListOf(
        Dish("Tagliatelle al Ragù", "Fresh pasta with slow-cooked meat sauce", R.drawable.dish_tagliatelle),
        Dish("Risotto ai Funghi", "Creamy risotto with porcini mushrooms", R.drawable.dish_risotto),
        Dish("Grilled Sea Bass", "Served with lemon, herbs and roasted vegetables", R.drawable.dish_grilled_sea_bass),

    )
    private val desserts = mutableListOf(
        Dish("Tiramisù", "Classic Italian dessert with mascarpone and espresso", R.drawable.dish_tiramisu),
        Dish("Panna Cotta", "Vanilla cream with berry coulis", R.drawable.dish_panna_cotta),
        Dish("Lemon Sorbet", "Refreshing sorbet with Sicilian lemon", R.drawable.dish_lemon_sorbet)

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonStarters = findViewById<Button>(R.id.buttonStarters)
        val buttonMains = findViewById<Button>(R.id.buttonMains)
        val buttonDesserts = findViewById<Button>(R.id.buttonDesserts)


        recyclerDishes = findViewById(R.id.recyclerDishes)
        textCategoryTitle = findViewById(R.id.textCategoryTitle)
        layoutMenuSection = findViewById(R.id.layoutMenuSection)
        buttonBackToMenu = findViewById(R.id.buttonBackToMenu)
        viewMenuDivider = findViewById(R.id.viewMenuDivider)

        recyclerDishes.layoutManager = LinearLayoutManager(this)
        dishesAdapter = DishesAdapter(emptyList())
        recyclerDishes.adapter = dishesAdapter

        buttonStarters.setOnClickListener {
            showCategory("Starters", starters)

        }

        buttonMains.setOnClickListener {
            showCategory("Main Courses", mains)
        }

        buttonDesserts.setOnClickListener {
            showCategory("Desserts", desserts)
        }

        buttonBackToMenu.setOnClickListener {
            goBackToMenu()
        }
    }


    private fun showCategory(title: String, dishes: List<Dish>) {
        textCategoryTitle.text = title
        textCategoryTitle.visibility = View.VISIBLE
        viewMenuDivider.visibility = View.VISIBLE

        layoutMenuSection.visibility = View.GONE

        recyclerDishes.visibility = View.VISIBLE

        buttonBackToMenu.visibility = View.VISIBLE
        dishesAdapter.submitList(dishes)

    }

    private fun goBackToMenu() {
        recyclerDishes.visibility = View.GONE
        textCategoryTitle.visibility = View.GONE
        viewMenuDivider.visibility = View.GONE
        buttonBackToMenu.visibility = View.GONE
        layoutMenuSection.visibility = View.VISIBLE
        dishesAdapter.submitList(emptyList())

    }

    private inner class DishesAdapter (
        private var items: List<Dish>
    ) : RecyclerView.Adapter<DishesAdapter.DishViewHolder>() {
        inner class DishViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val image: ImageView = itemView.findViewById(R.id.imageDish)
            val name: TextView = itemView.findViewById(R.id.textDishName)
            val description: TextView = itemView.findViewById(R.id.textDishDescription)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DishViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_dish, parent, false)
            return DishViewHolder(view)
        }

        override fun onBindViewHolder(holder: DishViewHolder, position: Int) {
            val dish = items[position]
            holder.image.setImageResource(dish.imageResId)
            holder.name.text = dish.name
            holder.description.text = dish.description
        }

        override fun getItemCount(): Int = items.size

        fun submitList(newItems: List<Dish>) {
            items = newItems
            notifyDataSetChanged()
        }
    }
}