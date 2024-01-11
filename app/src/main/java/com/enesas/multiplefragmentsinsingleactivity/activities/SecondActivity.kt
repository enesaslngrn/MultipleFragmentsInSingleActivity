package com.enesas.multiplefragmentsinsingleactivity.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enesas.multiplefragmentsinsingleactivity.R
import com.enesas.multiplefragmentsinsingleactivity.fragments.TitleFragment
import com.enesas.multiplefragmentsinsingleactivity.databinding.ActivitySecondBinding
import com.enesas.multiplefragmentsinsingleactivity.fragments.HomeFragmentDirections
import com.enesas.multiplefragmentsinsingleactivity.fragments.OverviewFragment
import com.enesas.multiplefragmentsinsingleactivity.fragments.PhotosFragment
import com.enesas.multiplefragmentsinsingleactivity.fragments.ReviewsFragment

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, TitleFragment()).commit()
        }

        binding.btnOverview.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView2, OverviewFragment()).commit()
            }
        }

        binding.btnPhotos.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView2, PhotosFragment()).commit()
            }
        }

        binding.btnReviews.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView2, ReviewsFragment()).commit()
            }
        }

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}