package com.example.riceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Lets Roll"
        rollButton.setOnClickListener {
           rollDice()
        }

    }

    private fun rollDice() {


        val resultInt=Random().nextInt(6)+1

        val drawableResource =when(resultInt){
            1 -> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            else-> R.drawable.dice_6
        }
        val diceImage:ImageView =findViewById(R.id.dice_image)
        diceImage.setImageResource(drawableResource)

    }
}