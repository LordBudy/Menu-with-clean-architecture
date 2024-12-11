package com.example.menuwithcleanachitecture.Domain.MiniWindow

import com.example.menuwithcleanachitecture.Domain.Menu1.Menu1DishListRepository

class CloseMiniWindow(private val menu1DishListRepository: Menu1DishListRepository) {

//    Закрывает мини окно возвращает на предидущее меню
    fun backToMenu(){
        return menu1DishListRepository.backToMenu()
    }
}