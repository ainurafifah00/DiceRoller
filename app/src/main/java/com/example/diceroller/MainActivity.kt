package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        //rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
            Toast.makeText(this, "button clicked!",
            Toast.LENGTH_SHORT).show()
        }
    }
}