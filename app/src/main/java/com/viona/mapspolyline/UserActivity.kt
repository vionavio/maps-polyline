package com.viona.mapspolyline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.viona.mapspolyline.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {


    private lateinit var binding: ActivityUserBinding

    private var counter = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            counter += 1
            binding.textCounter.text = "$counter"
            println("----- COUNTER -> $counter")
        }
    }
}