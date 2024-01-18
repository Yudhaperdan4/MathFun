package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class finish3 : AppCompatActivity() {
    private lateinit var play1 : ImageView
    private lateinit var skip1 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish3)
        play1 = findViewById(R.id.play1)
        skip1 = findViewById(R.id.skip1)

        play1.setOnClickListener {
            startActivity(Intent(this, quiz11::class.java))
        }
        skip1.setOnClickListener {
            startActivity(Intent(this, quiz::class.java))
        }
    }
}