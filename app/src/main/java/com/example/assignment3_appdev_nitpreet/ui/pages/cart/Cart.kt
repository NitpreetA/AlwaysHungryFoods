package com.example.assignment3_appdev_nitpreet.ui.pages.cart

import android.text.TextUtils
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.assignment3_appdev_nitpreet.CartItems
import com.example.assignment3_appdev_nitpreet.LocalNavController
import com.example.assignment3_appdev_nitpreet.R
import com.example.assignment3_appdev_nitpreet.ui.Routes
import com.example.assignment3_appdev_nitpreet.ui.components.FoodDivider
import java.text.NumberFormat


@Composable
fun Cart()
{
val navController = LocalNavController.current
val cartItems = CartItems.current
    if(cartItems.size == 0)
    {
        Text(text = "Your cart is empty", fontSize = 5.em)
    }
LazyColumn{
    var total =0.00
    itemsIndexed(cartItems){index, item ->
        if(cartItems.size == 0)
        {
            Text(text = "Your cart is empty", fontSize = 5.em)
        }

        total+= item.foodItem.price
        Column(modifier = Modifier.height(150.dp)) {

            Text(text = "${item.foodItem.foodName}")
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(text ="${NumberFormat.getCurrencyInstance().format(item.foodItem.price)}", fontSize = 5.em)
                Spacer(modifier = Modifier.weight(1f))
                Button(onClick = { navController.navigate(Routes.Confirmation.go(index)) }) {
                    Text(text = "Details")
                }
                Button(onClick = { cartItems.removeAt(index = index) }) {
                    Icon(imageVector = Icons.Filled.Delete, contentDescription ="Remove" )
                }
            }
            if (!TextUtils.isEmpty(item.msg))
            {
                Text(text = "Item has special intructions")
            }

        }
        Spacer(modifier = Modifier.height(10.dp))
        FoodDivider()

        if (index == cartItems.size -1){
            Spacer(modifier = Modifier.height(100.dp))
            Box(contentAlignment = Alignment.BottomStart, modifier =Modifier.fillMaxWidth()){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "SubTotal is: ${NumberFormat.getCurrencyInstance().format(total)}")
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Checkout")
                    }
                }
            }

        }
    }

}

}