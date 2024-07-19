package com.skydev.openinapp.di

import com.skydev.openinapp.ui.screen.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel {
        HomeViewModel()
    }
}