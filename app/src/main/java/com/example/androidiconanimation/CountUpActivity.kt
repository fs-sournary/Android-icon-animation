package com.example.androidiconanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_count_up.*

class CountUpActivity : AppCompatActivity() {

    private var stateIndex = 0
    private val digitStates = intArrayOf(
        R.attr.state_zero,
        R.attr.state_one,
        R.attr.state_two,
        R.attr.state_three,
        R.attr.state_four,
        R.attr.state_five,
        R.attr.state_six,
        R.attr.state_seven,
        R.attr.state_eight,
        R.attr.state_nine
    )
    private val maxIndex = digitStates.size

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count_up)
        root.setOnClickListener {
            stateIndex = (stateIndex + 1) % maxIndex
            val newStates = digitStates.mapIndexed { index, i ->
                if (index == stateIndex) i else -i
            }.toIntArray()
            digitImage.setImageState(newStates, true)
        }
    }
}
