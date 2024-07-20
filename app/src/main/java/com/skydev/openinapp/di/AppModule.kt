package com.skydev.openinapp.di

import com.skydev.openinapp.data.local.SharedPreferencesManager
import com.skydev.openinapp.data.remote.ApiService
import com.skydev.openinapp.data.remote.BASE_URL
import com.skydev.openinapp.data.repository.DashboardRepo
import com.skydev.openinapp.domain.repository.DashBoardRepository
import com.skydev.openinapp.ui.screen.home.HomeViewModel
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory


private val json: Json by lazy {
    Json {
        ignoreUnknownKeys = true
        isLenient = true
    }
}

val appModule = module {
    single {
        SharedPreferencesManager(get())
    }
    single {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(OkHttpClient())
            .addConverterFactory(
                json.asConverterFactory(
                    "application/json; charset=UTF8".toMediaType()
                )
            ).build()
        val service = retrofit.create(ApiService::class.java)
        service
    }
    single<DashboardRepo> {
        DashBoardRepository(get(), get())
    }
    viewModel {
        HomeViewModel(get())
    }
}