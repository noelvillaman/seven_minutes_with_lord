package com.namalliv.software.sevenminutewiththelord.ui.minute

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.namalliv.software.sevenminutewiththelord.R

class MinuteFragment : Fragment() {

    companion object {
        fun newInstance() = MinuteFragment()
    }

    private lateinit var viewModel: MinuteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_minute, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MinuteViewModel::class.java)
        // TODO: Use the ViewModel
    }

}