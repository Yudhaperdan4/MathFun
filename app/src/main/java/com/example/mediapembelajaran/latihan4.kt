package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class latihan4 : AppCompatActivity() {
    private lateinit var sebelumnya1 : ImageView
    private lateinit var selesai : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan4)
        sebelumnya1 = findViewById(R.id.sebelumnya1)
        selesai = findViewById(R.id.selesai)

        sebelumnya1.setOnClickListener {
            startActivity(Intent(this, latihan3::class.java))
        }
        selesai.setOnClickListener {
            startActivity(Intent(this, latihan::class.java))
        }
    }
}