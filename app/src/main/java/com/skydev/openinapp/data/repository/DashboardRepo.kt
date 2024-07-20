package com.skydev.openinapp.data.repository

import com.skydev.openinapp.data.model.DashBoardResponse

interface DashboardRepo {

    suspend fun getDashBoard() : DashBoardResponse?

}