package com.seoultech.fooddeuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.seoultech.fooddeuk.databinding.ActivityMainBinding
import com.seoultech.fooddeuk.databinding.ActivitySignUpBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        tmpButtonsClickListener() // TODO : 후에 점점 기능들 붙여지면 지울 것
    }

    private fun tmpButtonsClickListener() {
        binding.tmpSignUpButton.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        binding.tmpGuideButtonCustomer.setOnClickListener {
            val intent = Intent(this, IntroCustomerActivity::class.java)
            startActivity(intent)
        }
        binding.tmpGuideButtonCeo.setOnClickListener {
            val intent = Intent(this, IntroCEOActivity::class.java)
            startActivity(intent)
        }
    }
}