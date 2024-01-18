package com.example.mediapembelajaran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class latihan2 : AppCompatActivity() {
    private lateinit var selanjutnya1 : ImageView
    private lateinit var sebelumnya1 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan2)
        selanjutnya1 = findViewById(R.id.selanjutnya1)
        sebelumnya1 = findViewById(R.id.sebelumnya1)

        selanjutnya1.setOnClickListener {
            startActivity(Intent(this, latihan3::class.java))
        }
        sebelumnya1.setOnClickListener {
            startActivity(Intent(this, latihan1::class.java))
        }
    }
}