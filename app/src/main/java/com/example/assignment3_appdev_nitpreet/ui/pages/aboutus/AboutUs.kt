package com.example.assignment3_appdev_nitpreet.ui.pages.aboutus

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.assignment3_appdev_nitpreet.R

@Composable
fun AboutUs() {
    Column(modifier = Modifier
        .height(160.dp)) {

        Row (modifier = Modifier
            .fillMaxSize()
            ,

            horizontalArrangement = Arrangement.SpaceBetween) {
            Image(painter = painterResource(
                id = R.drawable.knife),
                contentDescription = "Logo ",
                Modifier
                    .size(120.dp)
            )
            Text(text = "Our Goal\nHere is our goal this is a text to see if it goes past the end of the screen or if it will fill the rest of the screen ",
            )
        }

    }



}