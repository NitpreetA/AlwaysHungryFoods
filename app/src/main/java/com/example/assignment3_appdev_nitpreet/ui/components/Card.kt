package com.example.assignment3_appdev_nitpreet.ui.components

import android.app.Dialog
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import com.example.assignment3_appdev_nitpreet.model.Food
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.window.Dialog
import com.example.assignment3_appdev_nitpreet.CartItems
import com.example.assignment3_appdev_nitpreet.LocalNavController
import com.example.assignment3_appdev_nitpreet.model.CartItem
import com.example.assignment3_appdev_nitpreet.ui.Routes

import com.example.compose.AppTheme


import java.text.NumberFormat

/*
WBS LOE
Sub Task used 1 hour minutes expected to be done in 45 min
Needed to get all the correct details move files over and crop images.
Issues with font size and row placement
 */


/*
hungry card which sets up the card layout with
image
name
price and button

Takes in a food item which contains all info to display
Items is the shoping cart when add to cart in clicked food is added to list
 */
@Composable
fun FoodCard(
    food: Food,
) {
    val navController = LocalNavController.current
    val cartItems = CartItems.current
    val showDialog = remember {
        mutableStateOf(false)
    }
    Card(
        modifier = Modifier
            .size(300.dp)
            .padding(16.dp),
        shape = RoundedCornerShape(8.dp),
    ) {
        Column(
            modifier = Modifier

                .padding(16.dp)
        ) {
            // Food Image
            Image(
                painter = painterResource(id = food.image),
                contentDescription = "Food image of ${food.foodName}",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp)
                    .clip(CircleShape)
                    .align(CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = food.foodName!!,
                fontSize = 5.em,
                fontFamily = FontFamily.Cursive,
                color = Color(0xFFE9C400)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Food Price
                Text(
                    text = NumberFormat.getCurrencyInstance().format(food.price),
                    fontSize = 4.em,
                    fontFamily = FontFamily.Cursive,
                    color = Color(0xFFE9C400)
                )
                // Add to Cart Button
                Button(
                     onClick = {
                        cartItems.add(CartItem(food,""))
                         showDialog.value = true

                    },
                    modifier = Modifier.align(Alignment.CenterVertically),
                    enabled = true
                ) {
                    Text(text = "Add to Cart")
                }
                if (showDialog.value){
                    Dialogbox()

                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dialogbox(){
    Dialog(onDismissRequest = { /*TODO*/ }) {
        val cartItems = CartItems.current
        val navController = LocalNavController.current
        var text by remember { mutableStateOf("") }
        Card(
            modifier = Modifier
                .size(300.dp)
            ,) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Input any special instructions ", fontSize = 5.em)
                Spacer(modifier = Modifier.height(20.dp))
                TextField(value = text, onValueChange = {text = it}, placeholder = {Text(text = "Instructions")})
                cartItems[cartItems.size -1].msg = text
                Spacer(modifier = Modifier.height(40.dp))
                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End) {

                    Button(onClick = { navController.navigate(Routes.Confirmation.go(cartItems.size -1))}) {
                        Text(text = "Continue")
                    }
                }
            }

        }



    }
}

