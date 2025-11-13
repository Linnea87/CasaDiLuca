package com.example.casadiluca

import android.view.Menu

object MenuData {

    // ====== Starters =======================================
    val starters: List<MenuItem> = listOf(
        MenuItem(
            nameResId = R.string.item_name_starter_1,
            descResId = R.string.item_desc_starter_1,
            imageResId = R.drawable.img_starter_bruschetta
        ),
        MenuItem(
            nameResId = R.string.item_name_starter_2,
            descResId = R.string.item_desc_starter_2,
            imageResId = R.drawable.img_starter_caprese_salad
        ),
        MenuItem(
            nameResId = R.string.item_name_starter_3,
            descResId = R.string.item_desc_starter_3,
            imageResId = R.drawable.img_starter_carpaccio
        )
    )

    // ====== Mains ==========================================
    val mains: List<MenuItem> = listOf(
        MenuItem(
            nameResId = R.string.item_name_main_1,
            descResId = R.string.item_desc_main_1,
            imageResId = R.drawable.img_main_tagliatelle
        ),
        MenuItem(
            nameResId = R.string.item_name_main_2,
            descResId = R.string.item_desc_main_2,
            imageResId = R.drawable.img_main_risotto
        ),
        MenuItem(
            nameResId = R.string.item_name_main_3,
            descResId = R.string.item_desc_main_3,
            imageResId = R.drawable.img_main_grilled_sea_bass
        )
    )

    // ====== Desserts =======================================
    val desserts: List<MenuItem> = listOf(
        MenuItem(
            nameResId = R.string.item_name_dessert_1,
            descResId = R.string.item_desc_dessert_1,
            imageResId = R.drawable.img_dessert_tiramisu
        ),
        MenuItem(
            nameResId = R.string.item_name_dessert_2,
            descResId = R.string.item_desc_dessert_2,
            imageResId = R.drawable.img_dessert_panna_cotta
        ),
        MenuItem(
            nameResId = R.string.item_name_dessert_3,
            descResId = R.string.item_desc_dessert_3,
            imageResId = R.drawable.img_dessert_lemon_sorbet
        )
    )
}