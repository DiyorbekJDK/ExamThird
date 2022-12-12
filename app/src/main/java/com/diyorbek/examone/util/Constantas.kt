package com.diyorbek.examone.util

import com.diyorbek.examone.R
import com.diyorbek.examone.model.Planet

object Constantas {
    fun list(): MutableList<Planet> {
        return mutableListOf(
            Planet(R.drawable.eath, "Earth"),
            Planet(R.drawable.mars, "Mars"),
            Planet(R.drawable.neptun, "Neptun"),
            Planet(R.drawable.uran, "Uran"),
            Planet(R.drawable.venera, "Venera"),
            Planet(R.drawable.sun, "Sun"),
            Planet(R.drawable.eath, "Earth"),
            Planet(R.drawable.yupiter, "Yupiter"),
        )
    }
}