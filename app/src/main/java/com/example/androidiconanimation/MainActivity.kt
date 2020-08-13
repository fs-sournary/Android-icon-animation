package com.example.androidiconanimation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkableButton.setOnClickListener {
            val intent = Intent(this, CheckableActivity::class.java)
            startActivity(intent)
        }
        clockButton.setOnClickListener {
            val intent = Intent(this, ClockActivity::class.java)
            startActivity(intent)
        }
        animalButton.setOnClickListener {
            val intent = Intent(this, AnimalActivity::class.java)
            startActivity(intent)
        }
        countUpButton.setOnClickListener {
            val intent = Intent(this, CountUpActivity::class.java)
            startActivity(intent)
        }
    }

}
