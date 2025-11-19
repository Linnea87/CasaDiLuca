package com.example.casadiluca

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenuFragment : Fragment(R.layout.fragment_menu) {

    private lateinit var menuRecycler: RecyclerView
    private lateinit var menuAdapter: MenuAdapter

    private var category: String? = null

    companion object {
        private const val ARG_CATEGORY = "CATEGORY"

        fun newInstance(category: String): MenuFragment {
            val fragment = MenuFragment()
            val args = Bundle()
            args.putString(ARG_CATEGORY, category)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        category = arguments?.getString(ARG_CATEGORY)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        menuRecycler = view.findViewById(R.id.menu_recycler)
        val bottomNav = view.findViewById<BottomNavigationView>(R.id.bottom_nav)

        // ---- Välj rätt lista baserat på kategori ----
        val itemsToShow: List<MenuItem> = when (category) {
            "DRINKS" -> emptyList()  // uppdateras sen när du har drinklistan
            "FOOD" -> MenuData.starters + MenuData.mains + MenuData.desserts
            else -> MenuData.starters + MenuData.mains + MenuData.desserts
        }

        // ---- Recycler setup ----
        menuAdapter = MenuAdapter(itemsToShow)
        menuRecycler.layoutManager = LinearLayoutManager(requireContext())
        menuRecycler.adapter = menuAdapter
        

    }
}