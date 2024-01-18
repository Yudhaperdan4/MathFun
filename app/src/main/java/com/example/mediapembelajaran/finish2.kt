package com.example.mediapembelajaran

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class finish2 : AppCompatActivity() {
    private lateinit var play1 : ImageView
    private lateinit var skip1 : ImageView
    private lateinit var next2 : ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish2)
        play1 = findViewById(R.id.play1)
        skip1 = findViewById(R.id.skip1)
        next2 = findViewById(R.id.next2)

        play1.setOnClickListener {
            startActivity(Intent(this, quiz6::class.java))
        }
        skip1.setOnClickListener {
            startActivity(Intent(this, quiz::class.java))
        }
        next2.setOnClickListener {
            startActivity(Intent(this, quiz11::class.java))
        }
    }
}