package com.example.androidiconanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_animal.*

class AnimalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)
        hippoButton.setOnClickListener {
            hippoButton.isEnabled = false
            buffaloButton.isEnabled = true
            elephantButton.isEnabled = true
            iconImage.setImageState(STATE_SET_HIPPO, true)
        }
        buffaloButton.setOnClickListener {
            buffaloButton.isEnabled = false
            hippoButton.isEnabled = true
            elephantButton.isEnabled = true
            iconImage.setImageState(STATE_SET_BUFFALO, true)
        }
        elephantButton.setOnClickListener {
            elephantButton.isEnabled = false
            hippoButton.isEnabled = true
            buffaloButton.isEnabled = true
            iconImage.setImageState(STATE_SET_ELEPHANT, true)
        }
    }

    companion object {

        private val STATE_SET_HIPPO =
            intArrayOf(R.attr.state_hippo, -R.attr.state_buffalo, -R.attr.state_elephant)
        private val STATE_SET_BUFFALO =
            intArrayOf(R.attr.state_buffalo, -R.attr.state_hippo, -R.attr.state_elephant)
        private val STATE_SET_ELEPHANT =
            intArrayOf(R.attr.state_elephant, -R.attr.state_hippo, -R.attr.state_buffalo)
    }
}
