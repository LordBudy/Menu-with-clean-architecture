package com.example.menuwithcleanachitecture.Presentation.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.menuwithcleanachitecture.Domain.Basket.DeleteDishUseCase
import com.example.menuwithcleanachitecture.Domain.Basket.GetAllDishesUseCase
import com.example.menuwithcleanachitecture.Domain.Basket.MinusDishUseCase
import com.example.menuwithcleanachitecture.Domain.Basket.PlusDishUseCase
import com.example.menuwithcleanachitecture.Domain.Menu1.MiniWindow.AddSaveDishToBasketUseCase
import com.example.menuwithcleanachitecture.Domain.models.DishItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BasketViewModel @Inject constructor(
    //получаем все UseCase через конструктор
    private val getAllDishesUseCase: GetAllDishesUseCase,
    private val deleteDishUseCase: DeleteDishUseCase,
    private val minusDishUseCase: MinusDishUseCase,
    private val plusDishUseCase: PlusDishUseCase,
    private val addDishUseCase: AddSaveDishToBasketUseCase
) : ViewModel() {

    private val _basketItems = MutableLiveData<List<DishItem>>()
    val basketItems: LiveData<List<DishItem>> = _basketItems

    init{
        getBasketItems()
    }

    private fun getBasketItems(){
        viewModelScope.launch {
            getAllDishesUseCase().observeForever {
                _basketItems.value = it
            }
        }
    }
    fun deleteDish(dishItem: DishItem) {
        viewModelScope.launch {
            deleteDishUseCase(dishItem)
            getBasketItems() // Обновляем список после удаления
        }
    }

    fun minusDish(dishItem: DishItem) {
        viewModelScope.launch {
            minusDishUseCase(dishItem)
            getBasketItems() // Обновляем список после уменьшения количества
        }
    }

    fun plusDish(dishItem: DishItem) {
        viewModelScope.launch {
            plusDishUseCase(dishItem)
            getBasketItems() // Обновляем список после увеличения количества
        }
    }

    fun addDish(dishItem: DishItem) {
        viewModelScope.launch {
            addDishUseCase(dishItem)
            getBasketItems() // Обновляем список после добавления
        }
    }
}