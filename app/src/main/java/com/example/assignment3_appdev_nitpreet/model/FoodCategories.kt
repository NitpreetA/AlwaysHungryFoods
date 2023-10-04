package com.example.assignment3_appdev_nitpreet.model


/*
WBS LOE
This subtask took 35 minutes expect 1 hour
Very simple file to seperate tasks
Only issue was how to deal with the images
 */

data class FoodCategories (
    val id: Int,
    val name: String,
    val foods: List<Food>,
    val type: CollectionType = CollectionType.Normal
)
object FoodRepo {
    fun getFoodCat(): List<FoodCategories> = foodCategory

}
enum class CollectionType { Normal, Highlight }

//Different types of categories which have different parts of the list
private val MainMeal = FoodCategories(
    id = 1,
    name = "Hungrys' ",
    type = CollectionType.Highlight,
    foods = foods.subList(0, 6)
)
private val Platters = FoodCategories(
    id = 2,
    name = "Platters",
    type = CollectionType.Highlight,
    foods = foods.subList(7,11)
)
private  val foodCategory = listOf(
    MainMeal,
    Platters
)