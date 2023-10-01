package com.example.assignment3_appdev_nitpreet.ui

import androidx.compose.runtime.Composable
import com.example.assignment3_appdev_nitpreet.ui.pages.home.Home

import com.example.compose.AppTheme

@Composable
fun HungryApp()
{
    //Applies the theme to the body which holds the layout of the application
    AppTheme(useDarkTheme = true) {
        Home()
    }


}