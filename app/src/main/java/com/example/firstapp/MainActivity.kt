package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textViewRef = findViewById<TextView>(R.id.textId)
        textViewRef.text = "Times Clicked: 0"

        val buttonRef = findViewById<Button>(R.id.buttonId)

        var timesCLicked = 0

        buttonRef.setOnClickListener {
            timesCLicked +=1
            textViewRef.text = "Times Clicked: $timesCLicked "
        }



    }
}