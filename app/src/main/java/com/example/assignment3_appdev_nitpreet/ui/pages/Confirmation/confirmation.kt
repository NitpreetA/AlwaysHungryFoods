package com.example.assignment3_appdev_nitpreet.ui.pages.Confirmation

import android.icu.text.AlphabeticIndex
import android.os.Bundle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.assignment3_appdev_nitpreet.CartItems
import com.example.assignment3_appdev_nitpreet.model.Food


@Composable
fun Confirmation(int: Int?, modifier: Modifier = Modifier){
val cartItems = CartItems.current
Text(text = "You added ${cartItems[int!!].foodName} ")



}
