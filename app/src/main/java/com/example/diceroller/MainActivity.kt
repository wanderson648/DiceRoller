package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btn_roll)

        rollButton.setOnClickListener { rollDice() }
        
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.tv_number)
        resultTextView.text = dice.roll().toString()
    }
}