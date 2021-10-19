package com.example.uipractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var button : Button
    lateinit var button2 :Button
    lateinit var button3 :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)
        button3=findViewById(R.id.button3)
        button.setOnClickListener {
            startActivity(Intent(this,Google::class.java))
        }
        button2.setOnClickListener {
            startActivity(Intent(this, FaceBook::class.java))
        }
        button3.setOnClickListener {
            startActivity(Intent(this,Instagram::class.java))
        }
    }
}