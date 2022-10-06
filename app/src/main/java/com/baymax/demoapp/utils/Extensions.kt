package com.baymax.demoapp.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import java.math.RoundingMode
import java.text.DecimalFormat


fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}

fun Double?.roundOffDecimal(): Double? {
    return if (this != null) {
        val df = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.FLOOR
        df.format(this).toDouble()
    } else null
}