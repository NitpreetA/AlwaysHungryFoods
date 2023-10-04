package com.example.assignment3_appdev_nitpreet.ui.pages.Confirmation

import android.icu.text.AlphabeticIndex
import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.assignment3_appdev_nitpreet.CartItems
import com.example.assignment3_appdev_nitpreet.model.Food
import com.example.assignment3_appdev_nitpreet.R
import com.example.assignment3_appdev_nitpreet.ui.components.FoodDivider
import java.text.NumberFormat


@Composable
fun Confirmation(int: Int?, modifier: Modifier = Modifier){
    val cartItems = CartItems.current
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)) {
        Text(text = "You have added ${cartItems[int!!].foodName}",
            fontSize = 6.em,
            fontFamily = FontFamily.Cursive,
            color = Color(0xFFE9C400)
        )
        FoodDivider()
        Spacer(modifier = Modifier.height(15.dp))

        Box(modifier = Modifier
            .height(150.dp)
            .fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = cartItems[int!!].image), contentDescription = "Picture of food", alignment = Alignment.Center)
        }

        Spacer(modifier = Modifier.height(15.dp))
        Column {
            Text(text = "Description:", style = TextStyle(textDecoration = TextDecoration.Underline), fontSize = 4.em,)
            Text(text = "${cartItems[int!!].description}")

        }

        Spacer(modifier = Modifier.height(100.dp))
        Row {
            Text(text = "Price: ${NumberFormat.getCurrencyInstance().format(cartItems[int!!].price)}",
                textDecoration = TextDecoration.Underline)
            Spacer(modifier = Modifier.width(20.dp))

        }
        Row {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Continue")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Remove from cart")
            }
        }
    }











}
