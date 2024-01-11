package com.enesas.multiplefragmentsinsingleactivity.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enesas.multiplefragmentsinsingleactivity.activities.SecondActivityArgs
import com.enesas.multiplefragmentsinsingleactivity.databinding.FragmentOverviewBinding


class OverviewFragment : Fragment() {

    private lateinit var binding : FragmentOverviewBinding
    private var movieId = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOverviewBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}