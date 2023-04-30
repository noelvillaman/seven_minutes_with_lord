package com.namalliv.software.sevenminutewiththelord.ui.home

import androidx.lifecycle.ViewModel
import com.namalliv.software.sevenminutewiththelord.R
import com.namalliv.software.sevenminutewiththelord.classes.GlobalAppContext
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class HomeViewModel : ViewModel() {

    private val _text_flow = flow {
        val value = GlobalAppContext.appContext?.getString(R.string.message_home)
        emit(value)
    }
    val text_flow = _text_flow

    fun timerFlow() : Flow<Int>{
        return flow {
            repeat(30){
                emit(it+1)
                delay(1000L)
            }
        }
    }

    fun progressFlow() : Flow<Int>{
        return flow {
            repeat(30){
                emit(it+1)
                delay(1000L)
            }
        }
    }
}