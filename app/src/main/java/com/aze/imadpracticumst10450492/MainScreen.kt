package com.aze.imadpracticumst10450492

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen() : AppCompatActivity(), Parcelable {

    private lateinit var tvDay1: TextView
    private lateinit var tvDay2: TextView
    private lateinit var tvDay3: TextView
    private lateinit var tvDay4: TextView
    private lateinit var tvDay5: TextView
    private lateinit var tvDay6: TextView
    private lateinit var tvDay7: TextView
    private lateinit var tvAverageTemp: TextView
    private lateinit var btnClear: Button
    private lateinit var btnCalculateAverage: Button
    private lateinit var btnExit: Button
    private lateinit var bynViewDetails: Button
    private val sampleTemperatures = arrayOf(20.5f, 22.3f, 23.8f, 24.0f, 22.7f, 21.0f, 19.5f)

    constructor(parcel: Parcel) : this() {

    }


    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainScreen> {
        override fun createFromParcel(parcel: Parcel): MainScreen {
            return MainScreen(parcel)
        }

        override fun newArray(size: Int): Array<MainScreen?> {
            return arrayOfNulls(size)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        tvDay1 = findViewById(R.id.tvDay1)
        tvDay2 = findViewById(R.id.tvDay2)
        tvDay3 = findViewById(R.id.tvDay3)
        tvDay4 = findViewById(R.id.tvDay4)
        tvDay5 = findViewById(R.id.tvDay5)
        tvDay6 = findViewById(R.id.tvDay6)
        tvDay7 = findViewById(R.id.tvDay7)
        tvAverageTemp = findViewById(R.id.tvAverageTemp)

        populateTemperatures()

        findViewById<Button>(R.id.btnCalculateAverage).setOnClickListener {
            calculateAverageTemperature()
        }

        findViewById<Button>(R.id.btnViewDetails).setOnClickListener {
            viewDetails()
        }

        findViewById<Button>(R.id.btnClear).setOnClickListener {
            clearData()
        }

        findViewById<Button>(R.id.btnExit).setOnClickListener {
            finish()
        }
    }

    private fun populateTemperatures() {
        tvDay1.text = "Day 1: ${20.5}"
        tvDay2.text = "Day 2: ${22.3}"
        tvDay3.text = "Day 3: ${23.8}"
        tvDay4.text = "Day 4: ${24.0}"
        tvDay5.text = "Day 5: ${22.7}"
        tvDay6.text = "Day 6: ${21.0}"
        tvDay7.text = "Day 7: ${19.5}"
    }

    private fun calculateAverageTemperature() {
        val average = sampleTemperatures.average()
        tvAverageTemp.text = "Average Temperature: %.2f".format(average)
    }

    private fun viewDetails() {
        val intent = Intent(this, DetailedAvtivity::class.java)
        intent.putExtra("temperatures", sampleTemperatures.toFloatArray())
        startActivity(intent)
    }

    // Function to clear the displayed average temperature
    private fun clearData() {
        tvAverageTemp.text = "Average Temperature: "
    }
}
