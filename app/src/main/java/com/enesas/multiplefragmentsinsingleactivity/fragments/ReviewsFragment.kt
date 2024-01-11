package com.enesas.multiplefragmentsinsingleactivity.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.enesas.multiplefragmentsinsingleactivity.R
import com.enesas.multiplefragmentsinsingleactivity.databinding.FragmentReviewsBinding

class ReviewsFragment : Fragment() {

    private lateinit var binding: FragmentReviewsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentReviewsBinding.inflate(inflater,container,false)
        return binding.root
    }
}