package com.example.assignment3_appdev_nitpreet.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class CartItem(
    val foodItem: Food,
    var msg: String
) : Parcelable