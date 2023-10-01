package com.example.assignment3_appdev_nitpreet.ui.components

import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/*
WBS LOE
This subtask was simple took 3 minutes  which was expected
 */


/*
Divider is created to clean up code
and to create separators for out content
 */
@Composable
fun FoodDivider(
    modifier: Modifier = Modifier,
    thickness: Dp = 1.dp,
    color: Color = Color(0xFFE9C400)

){
    Divider(
        modifier = modifier,
        color = color,
        thickness = thickness,
    )


}