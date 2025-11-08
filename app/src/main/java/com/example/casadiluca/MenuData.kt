package com.example.casadiluca

object MenuData {

    // ====== Starters =======================================
    val starters = mutableListOf(
        MenuItem(
            name = "Bruschetta",
            description = "Grilled bread with tomatoes and olive oil",
            imageResId = R.drawable.img_starter_bruschetta
        ),
        MenuItem(
            name = "Caprese Salad",
            description = "Mozzarella, tomatoes, and fresh basil",
            imageResId = R.drawable.img_starter_caprese_salad
        ),
        MenuItem(
            name = "Carpaccio",
            description = "Thinly sliced beef with olive oil and lemon",
            imageResId = R.drawable.img_starter_carpaccio
        )
    )

    // ====== Mains ==========================================
    val mains = mutableListOf(
        MenuItem(
            name = "Tagliatelle al Ragù",
            description = "Fresh pasta with slow-cooked meat sauce",
            imageResId = R.drawable.img_main_tagliatelle
        ),
        MenuItem(
            name = "Risotto ai Funghi",
            description = "Creamy risotto with porcini mushrooms",
            imageResId = R.drawable.img_main_risotto
        ),
        MenuItem(
            name = "Grilled Sea Bass",
            description = "Served with lemon, herbs and roasted vegetables",
            imageResId = R.drawable.img_main_grilled_sea_bass
        )
    )

    // ====== Desserts =======================================
    val desserts = mutableListOf(
        MenuItem(
            name = "Tiramisù",
            description = "Classic Italian dessert with mascarpone and espresso",
            imageResId = R.drawable.img_dessert_tiramisu
        ),
        MenuItem(
            name = "Panna Cotta",
            description = "Vanilla cream with berry coulis",
            imageResId = R.drawable.img_dessert_panna_cotta
        ),
        MenuItem(
            name = "Lemon Sorbet",
            description = "Refreshing sorbet with Sicilian lemon",
            imageResId = R.drawable.img_dessert_lemon_sorbet
        )
    )
}