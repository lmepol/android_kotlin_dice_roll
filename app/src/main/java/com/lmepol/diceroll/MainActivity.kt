package com.lmepol.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.roll_btn).setOnClickListener{
            roll()
        }
    }
    private fun roll() {
        val rand_val = (1..6).random()
        findViewById<TextView>(R.id.result_text).text = rand_val.toString()
        Toast.makeText(this, "$rand_val", Toast.LENGTH_LONG).show()
    }
}