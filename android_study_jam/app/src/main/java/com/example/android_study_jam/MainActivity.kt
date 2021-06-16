package com.example.android_study_jam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // define button and setting roll logic

        val rollButton: Button = findViewById(R.id.button)

        // click event listener
        rollButton.setOnClickListener {
        // val resultTextView: TextView = findViewById(R.id.textView);
        // resultTextView.text = "666"
            rollDice()
        }
    }

    private fun rollDice() {
        var dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView : TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

    class Dice(private val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }

}