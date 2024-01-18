package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class finish1 : AppCompatActivity() {
    private lateinit var play1 : ImageView
    private lateinit var skip1 : ImageView
    private lateinit var next1 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish1)
        play1 = findViewById(R.id.play1)
        skip1 = findViewById(R.id.skip1)
        next1 = findViewById(R.id.next1)

        play1.setOnClickListener {
            startActivity(Intent(this, quiz1::class.java))
        }
        skip1.setOnClickListener {
            startActivity(Intent(this, quiz::class.java))
        }
        next1.setOnClickListener {
            startActivity(Intent(this, quiz6::class.java))
        }
    }
}