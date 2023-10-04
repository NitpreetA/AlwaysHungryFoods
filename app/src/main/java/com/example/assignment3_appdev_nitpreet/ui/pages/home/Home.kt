package com.example.assignment3_appdev_nitpreet.ui.pages.home


import android.widget.PopupWindow
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import com.example.assignment3_appdev_nitpreet.CartItems
import com.example.assignment3_appdev_nitpreet.model.Food
import com.example.assignment3_appdev_nitpreet.model.FoodRepo
import com.example.assignment3_appdev_nitpreet.ui.components.FoodDivider
import com.example.assignment3_appdev_nitpreet.ui.layout.Bottom
import com.example.assignment3_appdev_nitpreet.ui.layout.MainLayout
import com.example.assignment3_appdev_nitpreet.ui.layout.TopBar
import com.example.assignment3_appdev_nitpreet.ui.rememberMutableStateListOf
import com.example.compose.AppTheme


/*
WBS LOE
This subtask took 2 hours expected 1 hour
Trying to match up with all other components of UI and then adding the cartItems took awhile to move around
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(modifier: Modifier = Modifier)
{

    //Gets the different types of categorises created in the FoodCategories
    val foodsCollections = remember {
        FoodRepo.getFoodCat()
    }
    val  text = remember {
        mutableStateOf(TextFieldValue())
    }
    AppTheme(useDarkTheme = false) {
        Dialog(onDismissRequest = { /*TODO*/ }) {

            Card(
                modifier = Modifier
                    .size(300.dp)
                    .padding(16.dp),) {
                Column {
                    Text(text = "Input your name")
                    TextField(value = text.value, onValueChange = {text.value = it})
                }
            }



        }
    }



        Box(modifier){
            LazyColumn{
                //Goes over the list to display the Category Name
                itemsIndexed(foodsCollections){index,foodCollection->
                    if (index!=0){
                        FoodDivider()
                    }
                    Text(
                        text = foodCollection.name ,
                        overflow = TextOverflow.Ellipsis,
                        fontSize = 7.em,
                        modifier = Modifier.padding(7.dp)
                    )
                    //called to display the items for that category
                    Items(foodItems = foodCollection.foods)
                }
            }
        }




}

