package com.example.assignment3_appdev_nitpreet.ui.layout

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/*
WBS LOE
This subtask took 3 Hours Expected 45 minutes
Had issues with the scaffold and tried searching up solutions all turned to dead ends
 */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainLayout(
    modifier: Modifier = Modifier,
    topBar: @Composable (() -> Unit) = {},
    bottomBar: @Composable (() -> Unit) = {},
    content: @Composable () -> Unit

){
    Scaffold(
        modifier = modifier,
        topBar = {TopBar()},
        bottomBar = { Bottom() },

        ){
        //ensures the content is not hidden under the top nav bar
        Column(modifier = Modifier.padding(it)) {
            content()
        }
    }

}
