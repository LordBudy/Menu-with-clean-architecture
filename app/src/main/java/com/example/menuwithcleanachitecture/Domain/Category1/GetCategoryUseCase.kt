package com.example.menuwithcleanachitecture.Domain.Category1

import com.example.menuwithcleanachitecture.Domain.models.CategoryDishItem

class GetCategoryUseCase(private val categoryListRepository: CategoryListRepository) {

    //    выводит лист категории
    fun getCategoryList(): List<CategoryDishItem> {
        return categoryListRepository.getCategoryList()
    }
}