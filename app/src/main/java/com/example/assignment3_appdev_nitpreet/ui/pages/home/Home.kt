package com.example.assignment3_appdev_nitpreet.ui.pages.home


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.assignment3_appdev_nitpreet.CartItems
import com.example.assignment3_appdev_nitpreet.model.Food
import com.example.assignment3_appdev_nitpreet.model.FoodRepo
import com.example.assignment3_appdev_nitpreet.ui.components.FoodDivider
import com.example.assignment3_appdev_nitpreet.ui.layout.Bottom
import com.example.assignment3_appdev_nitpreet.ui.layout.MainLayout
import com.example.assignment3_appdev_nitpreet.ui.layout.TopBar
import com.example.assignment3_appdev_nitpreet.ui.rememberMutableStateListOf


/*
WBS LOE
This subtask took 2 hours expected 1 hour
Trying to match up with all other components of UI and then adding the cartItems took awhile to move around
 */

@Composable
fun Home(modifier: Modifier = Modifier)
{

    //Gets the different types of categorises created in the FoodCategories
    val foodsCollections = remember {
        FoodRepo.getFoodCat()
    }

        Box(modifier){
            LazyColumn{
                //Goes over the list to display the Category Name
                itemsIndexed(foodsCollections){index,foodCollection->
                    if (index!=0){
                        FoodDivider()
                    }
                    Text(
                        text = foodCollection.name ,
                        overflow = TextOverflow.Ellipsis,
                        fontSize = 7.em,
                        modifier = Modifier.padding(7.dp)
                    )
                    //called to display the items for that category
                    Items(foodItems = foodCollection.foods)
                }
            }
        }




}

