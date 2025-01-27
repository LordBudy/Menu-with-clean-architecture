package com.example.menuwithcleanachitecture.Domain.Category1

import com.example.menuwithcleanachitecture.Domain.models.CategoryItem

class GetCategoryUseCase(private val categoryRepository: CategoryListRepository) {

    //    выводит лист категории
    suspend fun getCategoryList(): List<CategoryItem> {
        return categoryRepository.getCategoryList()
    }
}