package com.example.android_study_jam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text


/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
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
            // rollDice()
            // main()
        }
    }

    fun main() {
        val myFirstDice = Dice(6)
        val rollResult = myFirstDice.roll()
        val luckyNumber = 4

        when (rollResult) {
            luckyNumber -> print("you win")
            1 -> println("So sorry! You rolled a 1. Try again!")
            2 -> println("Sadly, you rolled a 2. Try again!")
            3 -> println("Unfortunately, you rolled a 3. Try again!")
            4 -> println("No luck! You rolled a 4. Try again!")
            5 -> println("Don't cry! You rolled a 5. Try again!")
            6 -> println("Apologies! you rolled a 6. Try again!")
        }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // create new Dice object with 6 sides and roll it
        var dice = Dice(6)
        val diceRoll = dice.roll()

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

    class Dice(private val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }


    }

}