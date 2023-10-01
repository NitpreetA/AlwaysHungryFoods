package com.example.assignment3_appdev_nitpreet.ui.layout


import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/*
WBS LOE
This subtask was simple took 15 minutes  which was expected
 */

/*
Bottom bar with nav buttons

currently non functional
 */
@Composable
fun Bottom(modifier: Modifier = Modifier)
{

    BottomAppBar(modifier = modifier.statusBarsPadding(), tonalElevation =0.dp )
    {
        NavigationBarItem(selected = false, onClick = { /*TODO*/ }, icon = {  Icon(imageVector = Icons.Filled.Home , contentDescription = "Hello") }, label = { Text(
            text = "Home"
        )} )

        NavigationBarItem(selected = false, onClick = { /*TODO*/ }, icon = {  Icon(imageVector = Icons.Filled.Search , contentDescription = "Hello") }, label = { Text(
            text = "Search"
        )})
        NavigationBarItem(selected = false, onClick = { /*TODO*/ }, icon = {  Icon(imageVector = Icons.Outlined.Favorite , contentDescription = "Hello") }, label = { Text(
            text = "Favorites"
        )})

    }

}