package com.skydev.openinapp.ui.screen.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import com.skydev.openinapp.data.model.DashBoardResponse
import com.skydev.openinapp.data.repository.DashboardRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import java.time.LocalTime

class HomeViewModel(private val repository: DashboardRepo) : ViewModel() {

    var greeting = MutableStateFlow("")
        private set

    var dashboard = MutableStateFlow<DashBoardResponse?>(null)

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

    fun getDashBoard() {
        viewModelScope.launch(Dispatchers.IO) {
           dashboard.value = repository.getDashBoard()
           Log.d("response",dashboard.value.toString())
        }
    }


}