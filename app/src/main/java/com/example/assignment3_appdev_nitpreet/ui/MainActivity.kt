package com.example.assignment3_appdev_nitpreet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.assignment3_appdev_nitpreet.model.Food

import com.example.assignment3_appdev_nitpreet.ui.Routes
import com.example.assignment3_appdev_nitpreet.ui.layout.MainLayout
import com.example.assignment3_appdev_nitpreet.ui.rememberMutableStateListOf
import com.example.compose.AppTheme


val LocalNavController = compositionLocalOf<NavHostController>{ error("No Nav Controller")}
val CartItems = compositionLocalOf<MutableList<Food>>{ error("No cart items found")}
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var cartItems = rememberMutableStateListOf<Food>()
            AppTheme(useDarkTheme = true) {
                val navController = rememberNavController()
                CompositionLocalProvider(LocalNavController provides navController,CartItems provides cartItems){
                    MainLayout {
                        Routes()
                    }
                }
            }

        }
    }
}