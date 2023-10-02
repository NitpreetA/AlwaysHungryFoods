package com.example.assignment3_appdev_nitpreet.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.assignment3_appdev_nitpreet.CartItems
import com.example.assignment3_appdev_nitpreet.LocalNavController
import com.example.assignment3_appdev_nitpreet.ui.pages.aboutus.AboutUs
import com.example.assignment3_appdev_nitpreet.ui.pages.cart.Cart
import com.example.assignment3_appdev_nitpreet.ui.pages.home.Home


sealed class Routes(val route:String){


    object  Main : Routes("Home")
    object About : Routes("About")

    object Cart : Routes("Cart")
}



@Composable
fun Routes() {
    val navController = LocalNavController.current

        NavHost(navController = navController, startDestination = "Home"){
            composable(Routes.Main.route){ Home() }
            composable(Routes.About.route){ AboutUs()}
            composable(Routes.Cart.route){ Cart() }
        }


}