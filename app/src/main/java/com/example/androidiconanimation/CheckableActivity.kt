package com.example.androidiconanimation

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class CheckableActivity : AppCompatActivity() {

    private var isRadioChecked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkable)
        val radioImageView: ImageView = findViewById(R.id.img_radio)
        val checkboxImageView: ImageView = findViewById(R.id.img_checkbox)
        val toggleImageView: ImageView = findViewById(R.id.img_toggle)
        radioImageView.setOnClickListener {
            isRadioChecked = !isRadioChecked
            val newState = android.R.attr.state_checked * if (isRadioChecked) 1 else -1
            val stateSet = IntArray(1) { newState }
            radioImageView.setImageState(stateSet, true)
            checkboxImageView.setImageState(stateSet, true)
            toggleImageView.setImageState(stateSet, true)
        }
    }

}
