package com.example.assignment3_appdev_nitpreet.ui.pages.aboutus

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.example.assignment3_appdev_nitpreet.R
import com.example.assignment3_appdev_nitpreet.ui.components.FoodDivider

@Composable
fun AboutUs() {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        //Header
        Text(text = "About Us", fontSize = 7.em)
        FoodDivider()
        Spacer(modifier = Modifier.height(25.dp))
        /**
         * Our goal
         */
        Row (modifier = Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Image(painter = painterResource(
                id = R.drawable.knife),
                contentDescription = "Logo ",
                Modifier
                    .size(120.dp)
            )
            Column {
                Text(text = "Our goal", fontSize = 5.em, style = TextStyle(textDecoration = TextDecoration.Underline) )
                Text(text ="Our family at Always Hungry Foods, aims to create an unforgettable dinning experience. We are passionate about the art of food and dedicated to satisfy " +
                    "not only your hunger, but also your cravings with our different luxurious meals.  ", )
            }

        }
        // To add space between each paragraph
        Column(modifier = Modifier.height(30.dp)) {
            Spacer(modifier = Modifier.height(10.dp))
            FoodDivider()

        }
        /**
         * We Love feed back
         */
        Row(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.width(250.dp)) {
                Text(text = "We Love Feedback",fontSize = 5.em, style = TextStyle(textDecoration = TextDecoration.Underline))
                Text(text ="Customer feedback is important to us. We love to hear back on what we are doing well and what needs improvement. " )
            }

            Image(painter = painterResource(id = R.drawable.customer), contentDescription = "Picture of food" )
        }





    }



}