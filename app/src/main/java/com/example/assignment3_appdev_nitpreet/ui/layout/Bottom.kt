package com.example.assignment3_appdev_nitpreet.ui.layout


import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.assignment3_appdev_nitpreet.LocalNavController
import com.example.assignment3_appdev_nitpreet.ui.Routes
import com.example.compose.AppTheme

/*
WBS LOE
This subtask was simple took 15 minutes  which was expected
 */

/*
Bottom bar with nav buttons

currently non functional
 */
data class NavBarIcon(

    val route: String,

    val icon: ImageVector

)
val items = listOf(NavBarIcon(route = Routes.Main.route, icon = Icons.Filled.Home),

NavBarIcon(route=Routes.About.route, icon=Icons.Filled.Info),

NavBarIcon(route=Routes.Cart.route, icon=Icons.Filled.ShoppingCart))


@Composable
fun Bottom(modifier: Modifier = Modifier) {
    val navController = LocalNavController.current

    val navBackStackEntry by navController.currentBackStackEntryAsState()

    val currentDestination = navBackStackEntry?.destination
    BottomAppBar(modifier = modifier.statusBarsPadding(), tonalElevation = 0.dp)
    {

        NavigationBar {
            items.forEachIndexed { index, item ->
                NavigationBarItem(

                icon = { Icon(item.icon, contentDescription = item.route) },

                selected = currentDestination?.hierarchy?.any {

                    currentDestination.route?.substringBefore('/') ==

                    item.route.substringBefore('/') } == true,

                onClick = { navController.navigate(item.route)},
                    label = { Text(text = item.route)}

                )
            }
        }


    }

}