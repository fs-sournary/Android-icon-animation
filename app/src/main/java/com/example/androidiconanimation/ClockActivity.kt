package com.example.androidiconanimation

import android.graphics.drawable.Animatable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_clock.*

class ClockActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clock)
        root.setOnClickListener {
            (img_alarm.drawable as? Animatable)?.start()
            (img_clock.drawable as? Animatable)?.start()
            (img_timer.drawable as? Animatable)?.start()
            (img_stop_watch.drawable as? Animatable)?.start()
        }
    }

}
