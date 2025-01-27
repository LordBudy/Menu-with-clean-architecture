package com.example.menuwithcleanachitecture.Domain.Basket

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.example.menuwithcleanachitecture.Domain.models.DishItem
import kotlinx.coroutines.Dispatchers


class GetAllDishesUseCase(private val repository: BasketDishsListRepository) {

    //Выводит список блюд в корзине если есть если нет то просто пустой список
    operator fun invoke(): LiveData<List<DishItem>> = liveData(Dispatchers.IO) {
        try {
            emit(repository.getAllDishes())
        } catch (e: Exception) {
            Log.e("GetAllDishesUseCase", "Error: ${e.message}", e) //  Более подробная информация
            emit(emptyList()) // Или другое значение
        }
    }


}