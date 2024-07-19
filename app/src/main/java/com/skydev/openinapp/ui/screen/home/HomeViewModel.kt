package com.skydev.openinapp.ui.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import java.time.LocalTime

class HomeViewModel : ViewModel() {

    var greeting = MutableStateFlow("")
        private set

    fun initGreeting() {
        fun getGreeting(): String {
            val currentTime = LocalTime.now()
            return when (currentTime.hour) {
                in 5..11 -> "Good morning"
                in 12..16 -> "Good afternoon"
                in 17..21 -> "Good evening"
                else -> "Good night"
            }
        }
        viewModelScope.launch(Dispatchers.Default) {
           greeting.value = getGreeting()
        }
    }


}