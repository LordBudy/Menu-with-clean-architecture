package com.example.menuwithcleanachitecture.Domain.Menu1.MiniWindow

import com.example.menuwithcleanachitecture.Domain.Menu1.Menu1Repository

class CloseMiniWindowUseCase(private val menu1Repository: Menu1Repository) {

//    Закрывает мини окно возвращает на предидущее меню
    suspend fun backToMenu(){
        return menu1Repository.backToMenu()
    }
}