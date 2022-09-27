package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btn_roll)

        rollButton.setOnClickListener {
            rollDice()
        }


    }

    private fun rollDice() {
        val dice = Dice(6)
        val resultTextView: TextView = findViewById(R.id.tv_number)
        resultTextView.text = dice.roll().toString()
    }
}