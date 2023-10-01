package com.example.assignment3_appdev_nitpreet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.assignment3_appdev_nitpreet.ui.HungryApp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            HungryApp()
        }
    }
}