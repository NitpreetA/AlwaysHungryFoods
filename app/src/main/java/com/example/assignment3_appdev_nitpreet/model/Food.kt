package com.example.assignment3_appdev_nitpreet.model


import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import com.example.assignment3_appdev_nitpreet.R

/*
Model UI And Testing are different tasks done (WBS)

Model Expected time was 2 hours
Model Total time needed was 1 hour and 5 minutes

UI Expected 4-5 Hours
Ui Spent approximately  12 hours
Main issues:
I spent a couple of days on trying to do something that didn't work (Splash screen)
And tiny trip ups that cause delays such as the scaffold issue

 Lastly Testing:
 Time took 45 minutes Expected an hour
 This was just me spending time trying different emulators and different apis to see if the content
 fit on the screen. A couple of issues with the cart info not saving and the content in the card
 not fitting in the container.

 Total time around 14 hours if  not including splash screen (~9 hours)

 */


/*
WBS LOE
Ths subtask took 30 minutes expected 1 hour
Very simple backend, issue with parcelable at first.
 */

//Backend data
@Parcelize
data class Food(
    val id: Int,
    val foodName: String?,
    val image: Int,
    val price: Double,
    val description: String?
    //Inherits from parcelable so the info can be saved when rotated
):Parcelable {

}

//List of all food items available. Image is grabbed from the drawable
val foods = listOf(
    Food(
        id = 1,
        foodName = "Shrimps 5pcs",
        image =  R.drawable.shrimp,
        price = 18.00,
        description = "5 pieces of shrimp with with caramelized lemon and garlic butter."

    ),
    Food(
        id = 2,
        foodName = "BBQ Island Chicken",
        image =  R.drawable.bbq,
        price = 18.00,
        description = "Grilled and chopped chicken thigh smothered in bbq island sauce served with sautéed mushrooms and choice of sweet potato purée or rice n peas topped with scallions."
    ),
    Food(
        id = 3,
        foodName = "Gourmet Mac n Cheese",
        image =  R.drawable.mac,
        price = 16.00,
        description = "Delicious creamy Mac n Cheese with chives and three different types of cheese."
    ),
    Food(
        id = 4,
        foodName = "Colonialised Shepherd’s Pie",
        image =  R.drawable.pie,
        price = 22.00,
        description = "British dish with a brown twist"
    ),
    Food(
        id = 5,
        foodName = "Lamb Chops (3pcs)",
        image =  R.drawable.lamb,
        price = 29.00,
        description = "Australian rack of lamb marinated in garlic, honey dijon, rosemary and Gujarati spices " +
                "accompanied by " +
                "Baby garlic potatoes and garlic sauce or Mashed potatoes"
    ),

    Food(
        id = 6,
        foodName = "Lobster and Shrimp Pasta",
        image =  R.drawable.pasta,
        price = 33.00,
        description = "Lobster and Shrimp pasta. " +
                "Spaghetti, Lobster & Tiger Shrimp " +
                "in a signature house sauce"
    ),
    Food(
        id = 7,
        foodName = "Seafood Boil Bag",
        image =  R.drawable.boil,
        price = 72.00,
        description = "Lobster tail & claw, snow crab, tiger shrimps " +
                "baby potatoes and sweet yellow corn all simmered  in our cajun sauce with a portion rice and peas."
    ),
    Food(
        id = 8,
        foodName = "Tomahawk AAA",
        image =  R.drawable.tomohawk,
        price = 93.00,
        description = "AAA Tomahawk Platter\nCan feed 2-4 people"
    ),

    Food(
        id = 9,
        foodName = "Lamb Chops Platter",
        image =  R.drawable.chopsplate,
        price = 69.00,
        description = "Australian rack of lamb marinated in garlic, honey dijon, rosemary and Gujarati" +
                " spices\nServed with 8pcs"
    ),
    Food(
        id = 10,
        foodName = "Bbq Island Chicken",
        image =  R.drawable.chickenplate,
        price = 68.00,
        description = "Grilled and chopped chicken thigh smothered in bbq island sauce topped with scallions" +
                "\nSevered in one tray"
    ),
    Food(
        id = 11,
        foodName = "Shrimp Platter",
        image =  R.drawable.shrimpplate,
        price = 65.00,
        description = "15 pieces of shrimp with with caramelized lemon and garlic butter."
    ),


)
