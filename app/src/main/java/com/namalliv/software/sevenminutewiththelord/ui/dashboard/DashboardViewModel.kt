package com.namalliv.software.sevenminutewiththelord.ui.dashboard

import androidx.lifecycle.ViewModel
import com.namalliv.software.sevenminutewiththelord.R
import com.namalliv.software.sevenminutewiththelord.classes.GlobalAppContext
import kotlinx.coroutines.flow.flow

class DashboardViewModel : ViewModel() {

    private val _text_flow = flow {
        val value = GlobalAppContext.appContext?.getString(R.string.message_dashboard)
        emit(value)
    }
    val text_flow = _text_flow

}