package com.skydev.openinapp.domain.repository

import com.skydev.openinapp.data.local.SharedPreferencesManager
import com.skydev.openinapp.data.model.DashBoardResponse
import com.skydev.openinapp.data.remote.ApiService
import com.skydev.openinapp.data.repository.DashboardRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DashBoardRepository(
    private val apiService: ApiService,
    private val sharedPreferencesManager: SharedPreferencesManager
) : DashboardRepo {
    override suspend fun getDashBoard(): DashBoardResponse? {
        return withContext(Dispatchers.IO) {
            val response = apiService.getDashboard(
                "Bearer " + sharedPreferencesManager.getToken()
            )
            response.body()
        }
    }
}