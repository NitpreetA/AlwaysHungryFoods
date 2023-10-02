package com.example.assignment3_appdev_nitpreet.ui.pages.home


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import com.example.assignment3_appdev_nitpreet.model.Food
import com.example.assignment3_appdev_nitpreet.ui.components.FoodCard


/*
WBS LOE
This subtask was simple took 8 minutes
 */


@Composable
fun Items(
    foodItems: List<Food>,
){
    Box{
        LazyRow{
            //Goes over the sublist of the category and displays all the food in the FoodCard format
            itemsIndexed(foodItems){index, item ->

                FoodCard(food = item)
            }
        }
    }
}