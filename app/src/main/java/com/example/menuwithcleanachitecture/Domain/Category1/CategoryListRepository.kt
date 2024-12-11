package com.example.menuwithcleanachitecture.Domain.Category1

import com.example.menuwithcleanachitecture.Domain.models.CategoryDishItem

interface CategoryListRepository {

//Выводит список квтегорий
    fun getCategoryList(): List<CategoryDishItem>

}