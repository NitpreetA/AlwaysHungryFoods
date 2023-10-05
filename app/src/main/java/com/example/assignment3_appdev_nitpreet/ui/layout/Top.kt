package com.example.assignment3_appdev_nitpreet.ui.layout


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar


import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.assignment3_appdev_nitpreet.CartItems
import com.example.assignment3_appdev_nitpreet.model.Food
import com.example.assignment3_appdev_nitpreet.ui.components.FoodDivider
import java.text.NumberFormat

/*
WBS LOE
This subtask took 2 hours expected 1 hr and 30 min
Ran into issues with the counter originally found a way around it using the cart size
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(modifier: Modifier = Modifier)
{
    //Used for the shoping cart action
    var expanded by remember { mutableStateOf(false)}
    val items = CartItems.current
    Column(modifier = modifier.statusBarsPadding())
    {

        TopAppBar(title = { Text(text = "Always Hungry Foods")}, actions = {
            Text(text = "${items.size}")
            IconButton(onClick = {expanded = !expanded }) {
                Icon(imageVector = Icons.Outlined.ShoppingCart, contentDescription = "")
            }
            DropdownMenu(expanded = expanded   , onDismissRequest = { expanded = false }) {

                items.forEachIndexed{index, food ->
                    DropdownMenuItem(
                        text = { Text(" ${index + 1}. ${food.foodItem.foodName} ${NumberFormat.getCurrencyInstance().format(food.foodItem.price)} ", color = Color(0xFFE8E2D9)) },
                        onClick = { },
                        enabled = false
                    )
                }
            }
        })
        FoodDivider()
    }


}