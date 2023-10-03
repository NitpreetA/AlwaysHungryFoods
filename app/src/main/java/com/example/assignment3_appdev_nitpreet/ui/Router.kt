package com.example.assignment3_appdev_nitpreet.ui

import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.assignment3_appdev_nitpreet.LocalNavController
import com.example.assignment3_appdev_nitpreet.model.Food
import com.example.assignment3_appdev_nitpreet.ui.pages.Confirmation.Confirmation
import com.example.assignment3_appdev_nitpreet.ui.pages.aboutus.AboutUs
import com.example.assignment3_appdev_nitpreet.ui.pages.cart.Cart
import com.example.assignment3_appdev_nitpreet.ui.pages.home.Home


sealed class Routes(val route:String){


    object  Main : Routes("Home")
    object About : Routes("About")

    object Cart : Routes("Cart")

    object Confirmation : Routes("Confirmation/{index}"){
        fun go(index: Int) = "Confirmation/$index"
    }
}



@Composable
fun Routes() {
    val navController = LocalNavController.current

        NavHost(navController = navController, startDestination = "Home"){
            composable(Routes.Main.route){ Home() }
            composable(Routes.About.route){ AboutUs()}
            composable(Routes.Cart.route){ Cart() }
            composable(Routes.Confirmation.route){ Confirmation(int = it.arguments?.getString("index")
                ?.toInt())}
        }


}