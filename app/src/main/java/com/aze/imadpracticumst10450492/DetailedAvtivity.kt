package com.aze.imadpracticumst10450492

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailedAvtivity : AppCompatActivity() {
    private lateinit var tvDay1: TextView
    private lateinit var tvDay2: TextView
    private lateinit var tvDay3: TextView
    private lateinit var tvDay4: TextView
    private lateinit var tvDay5: TextView
    private lateinit var tvDay6: TextView
    private lateinit var tvDay7: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_avtivity)

        // Initialize TextViews
        tvDay1 = findViewById(R.id.tvDay1)
        tvDay2 = findViewById(R.id.tvDay2)
        tvDay3 = findViewById(R.id.tvDay3)
        tvDay4 = findViewById(R.id.tvDay4)
        tvDay5 = findViewById(R.id.tvDay5)
        tvDay6 = findViewById(R.id.tvDay6)
        tvDay7 = findViewById(R.id.tvDay7)

        // Get temperatures from the intent
        val temperatures = intent.getFloatArrayExtra("temperatures") ?: return

        // Populate TextViews with the temperatures
        tvDay1.text = "Day 1: ${20.5f}"
        tvDay2.text = "Day 2: ${22.3f}"
        tvDay3.text = "Day 3: ${23.8f}"
        tvDay4.text = "Day 4: ${24.0f}"
        tvDay5.text = "Day 5: ${22.7f}"
        tvDay6.text = "Day 6: ${21.0f}"
        tvDay7.text = "Day 7: ${19.5f}"
    }
}


