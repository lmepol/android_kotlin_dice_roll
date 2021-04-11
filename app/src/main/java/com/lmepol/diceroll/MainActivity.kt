package com.lmepol.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var diceImageViewFirst: ImageView
    private lateinit var diceImageViewSecond: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImageViewFirst = findViewById(R.id.dice_image_1)
        diceImageViewSecond = findViewById(R.id.dice_image_2)
        findViewById<Button>(R.id.roll_btn).setOnClickListener {
            roll()
        }
    }

    private fun roll() {
        val randValueFirst = (1..6).random()
        val randValueSecond = (1..6).random()
        diceImageViewFirst.setImageResource(getRandomDiceImage(randValueFirst))
        diceImageViewSecond.setImageResource(getRandomDiceImage(randValueSecond))
        Toast.makeText(this, "$randValueFirst $randValueSecond", Toast.LENGTH_LONG).show()
    }

    private fun getRandomDiceImage(i:Int): Int {
        return when (i) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_1
        }
    }

}