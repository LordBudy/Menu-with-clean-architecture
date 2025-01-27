package com.example.menuwithcleanachitecture.Domain.Category1

import com.example.menuwithcleanachitecture.Domain.models.CategoryItem
import com.example.menuwithcleanachitecture.Domain.models.DishItem

interface CategoryListRepository {

//Выводит список квтегорий
    suspend fun getCategoryList(): List<CategoryItem>

    //открывает выбранное блюдо в фрагменте мини окно с подробным описанием
    suspend fun showMiniDish(dishId: Int): DishItem
}