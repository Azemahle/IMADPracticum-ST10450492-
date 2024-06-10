package com.aze.imadpracticumst10450492

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnMainScreen : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMainScreen= findViewById<Button>(R.id.btnMainScreen)
        btnMainScreen.setOnClickListener{
            val intent = Intent ( this, MainScreen::class.java)
            startActivity(intent)
        }
    }

}