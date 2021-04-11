package com.lmepol.diceroll

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var diceImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImageView = findViewById(R.id.dice_image)
        findViewById<Button>(R.id.roll_btn).setOnClickListener {
            roll()
        }
        findViewById<Button>(R.id.count_up_btn).setOnClickListener {
            countUp()
        }
    }
    private fun roll() {
        val rand_val = (1..6).random()
        val imageRecource = when(rand_val){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_1
        }
        diceImageView.setImageResource(imageRecource)
        Toast.makeText(this, "$rand_val", Toast.LENGTH_LONG).show()
    }
    private fun countUp(){
//        val textView = findViewById<TextView>(R.id.result_text)
//        val currentValue = try {
//            textView.text.toString().toInt()
//        }
//        catch (e: NumberFormatException){
//            0
//        }
//        if (currentValue<6){
//            textView.text = (currentValue+1).toString()
//        }
    }
}