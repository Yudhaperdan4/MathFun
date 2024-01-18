package com.example.mediapembelajaran

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class latihan : AppCompatActivity() {
    private lateinit var back : ImageView
    private lateinit var mulai : ImageView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan)
        back = findViewById(R.id.back)
        mulai = findViewById(R.id.mulai)

        back.setOnClickListener {
            startActivity(Intent(this, daskbord::class.java))
        }
        mulai.setOnClickListener {
            startActivity(Intent(this, latihan1::class.java))
        }
    }
}